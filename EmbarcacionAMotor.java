
/**
 * Clase con los datos específicos de una embarcación a motor.
 * @author Jose Luis Fernández Cañón
 * @version Version: 28/04/2016
 */
public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    /**
     * Constructor que inicializa los atributos con datos pasados por parámetros.
     * @param mtricula Matrícula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano Año de fabricación del velero.
     * @param propietario Dueño del velero.
     * @param potencia Potencia de la embarcación a motor.
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    /**
     * Muestra la información del objeto.
     * @return Cadena con la información sobre el objeto.
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
     * @return Potencia de la embarcación a motor.
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
}
