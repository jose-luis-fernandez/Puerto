
/**
 * Clase con los datos espec�ficos de una embarcaci�n a motor.
 * @author Jose Luis Fern�ndez Ca��n
 * @version Version: 28/04/2016
 */
public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    /**
     * Constructor que inicializa los atributos con datos pasados por par�metros.
     * @param mtricula Matr�cula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano A�o de fabricaci�n del velero.
     * @param propietario Due�o del velero.
     * @param potencia Potencia de la embarcaci�n a motor.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    /**
     * Muestra la informaci�n del objeto.
     * @return Cadena con la informaci�n sobre el objeto.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += potencia + "\n";
        return textoADevolver;
    }
    
    /**
     * Devuelve el coeficiente de bernua del velero.
     * @return Potencia de la embarcaci�n a motor.
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
}
