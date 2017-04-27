
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    //Estas dos constantes son fijas y se utilizan para calcular el precio del alquiler.
    private final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;

    /**
     * Constructor de nuestra clase
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
        cadena = barco.toString() + "\n" + "Dias de ocupacion: " + diasOcupacion + "\n" + "El amarre del barco es: " + posicionAmarre + "\n";
        return cadena;
    }

    /**
     * Este metodo devuelve el precio del alquiler tras calcularlo en funcion de los parametros, en caso de error
     * devuelve -1;
     */
    public float getPrecioAlquiler(){
        float precio;
        precio =  diasOcupacion * ((float)barco.getEslora() * VALOR_MULTIPLICADOR_ESLORA) + (barco.getCoeficienteBernua()
            * VALOR_MULTIPLICADOR_BERNUA);
        return precio;
    }
}
