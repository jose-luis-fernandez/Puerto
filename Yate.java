
/**
 * Clase con los datos espec�ficos de un yate.
 * @author Jose Luis Fern�ndez Ca��n
 * @version Version: 28/04/2016
 */
public class Yate extends EmbarcacionAMotor
{
    
    private int numCamarotes;
    
    /**
     * Constructor que inicializa los atributos con datos pasados por par�metros.
     * @param mtricula Matr�cula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano A�o de fabricaci�n del velero.
     * @param propietario Due�o del velero.
     * @param potencia Potencia del yate.
     * @param nCamarotes N�mero de camarotes del yate.
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int nCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        numCamarotes = nCamarotes;
    }
    
    /**
     * Muestra la informaci�n del objeto.
     * @return Cadena con la informaci�n sobre el objeto.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += numCamarotes + "\n";
        return textoADevolver;
    }
    
    /**
     * Devuelve el coeficiente de bernua del yate.
     * @return Potencia del yate + el n�mero de camarotes.
     */
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + numCamarotes;
    }
    
}
