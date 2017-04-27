
/**
 * Esta clase representa un alquiler de un amarre, que se puede generar con la clase Puerto, continene toda la informacion necesaria referente a ese alquiler. En funcion de los
 * atributos del barco que utilize el amarre y los dias de ocupacion nos genera el precio del mismo.
 * 
 * @author (Marcos Alvarez Varela) 
 * @version (28/04/2016)
 */
public class Alquiler
{
    //@param VALOR_MULTIPLICADOR_ESLORA se utiliza para multiplicar la eslora del barco a la hora de calcular el precio.
    private final int VALOR_MULTIPLICADOR_ESLORA = 10;
    
    //@param VALOR_MULTIPLICADOR_BERNUA se utiliza al calcular el precio para multiplicar el coeficiente bernua del barco.
    private final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;

    /**
     * Constructor de nuestra clase al que se le pasan los parametros referentes al numero de dias que se alquila el barco, el objeto Barco y la posicion del amarre que se va a
     * ocupar.
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre){
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    /**
     * Metodo toString. 
     */
    public String toString(){
        String cadena = "";
        cadena = barco.toString() + "Dias de ocupacion: " + diasOcupacion  + "\n" + "El amarre del barco es: " + posicionAmarre;
        return cadena;
    }

    /**
     * Este metodo devuelve el precio del alquiler en funcion de los parametros del barco y los dias de ocupacion, en caso de error
     * devuelve -1;
     */
    public float getPrecioAlquiler(){
        float precio;
        precio =  diasOcupacion * ((float)barco.getEslora() * VALOR_MULTIPLICADOR_ESLORA) + (barco.getCoeficienteBernua()
            * VALOR_MULTIPLICADOR_BERNUA);
        return precio;
    }
}
