
/**
 * Esta clase nos permite crear y gestionar alquileres de los amarres ademas de comprobar el estado de los mismos.
 * 
 * @author (Marcos Alvarez Varela) 
 * @version (Version: 1.0)
 */
public class Puerto
{
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
     */
    public float alquilarAmarre(int numeroDias, Barco barco){
        float precio = -1;
        //Invocamos al metodo que comprueba si hay amarres libres con este if.
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
     * Metodo que nos muestra por pantalla el estado de los amarres, si estan ocupados o no.
     */
    public void verEstadoAmarres(){
        for(int i = 0; i < amarres.length; i++){
            if(amarres[i] == null){
                System.out.println("El amarre " + i + " esta libre");
            }else{
                System.out.println("El amarre " + i + " esta ocupado");
            }
        }
    }
    
    /**
     * Metodo privado que nos devuelve la posicion en el array de un amarre libre.
     */
    private int posicionAmarreLibre(){
        int posicion = -1;
         int posicionLibre = 0;
         boolean libre = false;
       while(!libre && (posicionLibre < amarres.length)){
           if(amarres[posicion] == null){
               libre = true;
               posicion = posicionLibre;
            }
            posicionLibre++;
        }
        
        return posicion;
    }
    
    /**
     * Metodo que comprueba que tenemos amarres libres viendo si en nuestro array tenemos posiciones null.
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
