
/**
 * Clase con los datos específicos de un velero.
 * @author Jose Luis Fernández Cañón
 * @version Version: 28/04/2016
 */
public class Velero extends Barco
{
    
    private int numMastiles;

    /**
     * Constructor que inicializa los atributos con datos pasados por parámetros.
     * @param mtricula Matrícula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano Año de fabricación del velero.
     * @param propietario Dueño del velero.
     * @param nMastiles Número de mástiles del velero.
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int nMastiles)
    {
        super(matricula, eslora, ano, propietario);
        numMastiles = nMastiles;
    }
    
    /**
     * Muestra la información del objeto.
     * @return Cadena con la información sobre el objeto.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += numMastiles + "\n";
        return textoADevolver;
    }
     /**
      * Devuelve el coeficiente de bernua del velero.
      * @rteturn Numero de mástiles del velero.
      */
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
    
}
