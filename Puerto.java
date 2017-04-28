
/**
 * Esta clase nos permite crear y gestionar alquileres de los amarres ademas de comprobar el estado de los mismos.
 * 
 * @author (Marcos Alvarez Varela) 
 * @version (28/04/2017)
 */
public class Puerto
{
    //@param amarres es la coleccion donde estan representados los alquileres de los amarres y su estado. Null significa amarre libre.
    private Alquiler[] amarres;

    /**
     * Constructor de objetos de la clase puerto.
     */
    public Puerto()
    {
        amarres = new Alquiler[4];

    }
    
    /**
     * Este metodo nos permite crear un alquiler al que le pasamos los dias del mismo y un objeto Barco, devuelve
     * el precio del alquiler una vez pasada la informacion o -1 en caso de que no haya amarres libres.
     * 
     * @param numDias es el numero de dias que se va a alquilar el amarre.
     * @param barco representa al barco que va a alquilar el amarre.
     * @return precio retorna el precio del alquiler del amarre.
     */
    public float alquilarAmarre(int numeroDias, Barco barco){
        float precio = -1;
        //Invocamos al metodo que comprueba si hay amarres libres y con este if
        if(hayAmarresLibres()){
            int posicionAmarre = posicionAmarreLibre();
            Alquiler alquiler = new Alquiler(numeroDias, barco, posicionAmarre);
            amarres[posicionAmarre] = alquiler;
            precio = alquiler.getPrecioAlquiler();
        }
        return precio;
        
    }
    
    /**
     * Metodo que liquida el alquiler de un amarre que le pasamos por parametro segun su posicion, devueleve -1
     * en caso de que haya algun error.
     * 
     * @param posicionAmarre es la posicion en nuestra coleccion del amarre ocupado que se quiere liberar.
     * @return precio devuelve el precio del alquiler de ese amarre concreto.
     */
    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precio = -1;
        if(posicionAmarre >= 0 && posicionAmarre < amarres.length && amarres[posicionAmarre] != null ){
            precio = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return precio;
    }
    
    /**
     * Metodo que nos muestra por pantalla el estado de los amarres, si estan ocupados o no. Si lo estan, imprime por pantalla ademas los atributos del alquiler, del barco que esta
     * haciendo uso del mismo y del propietario.
     */
    public void verEstadoAmarres(){
        for(int i = 0; i < amarres.length; i++){
            if(amarres[i] == null){
                System.out.println("El amarre " + i + " esta libre" + "\n");
            }else{
                System.out.println("El amarre " + i + " esta ocupado");
                System.out.println("***Informacion del alquiler : " + "\n" + amarres[i] + "\n");
            }
        }
    }
    
    /**
     * Metodo privado que nos devuelve la posicion en el array de un amarre libre.
     * 
     * @return posicion devuelve la posicion en la coleccion del primer amarre libre.
     */
    private int posicionAmarreLibre(){
        int posicion = -1;
         int posicionLibre = 0;
         boolean libre = false;
       while(!libre && (posicionLibre < amarres.length)){
           if(amarres[posicionLibre] == null){
               libre = true;
               posicion = posicionLibre;
            }
            posicionLibre++;
        }
        
        return posicion;
    }
    
    /**
     * Metodo que comprueba que tenemos amarres libres viendo si en nuestro array tenemos posiciones null.
     * 
     * @return libre devuelve un valor booleano en funcion de si hay amarres disponibles para alquilar.
     */
    private boolean hayAmarresLibres(){
       boolean libres = false;
       int posicion = 0;
       while(!libres && (posicion < amarres.length)){
           if(amarres[posicion] == null){
               libres = true;
            }
            posicion++;
        }
       return libres;
    }


}