
/**
 * Clase con los datos espec�ficos de un velero.
 * @author Jose Luis Fern�ndez Ca��n
 * @version Version: 28/04/2016
 */
public class Velero extends Barco
{
    
    private int numMastiles;

    /**
     * Constructor que inicializa los atributos con datos pasados por par�metros.
     * @param mtricula Matr�cula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano A�o de fabricaci�n del velero.
     * @param propietario Due�o del velero.
     * @param nMastiles N�mero de m�stiles del velero.
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int nMastiles)
    {
        super(matricula, eslora, ano, propietario);
        numMastiles = nMastiles;
    }
    
    /**
     * Muestra la informaci�n del objeto.
     * @return Cadena con la informaci�n sobre el objeto.
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
      * @rteturn Numero de m�stiles del velero.
      */
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
    
}
