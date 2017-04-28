
/**
 * Clase con los datos específicos de un yate.
 * @author Jose Luis Fernández Cañón
 * @version Version: 28/04/2016
 */
public class Yate extends EmbarcacionAMotor
{
    
    private int numCamarotes;
    
    /**
     * Constructor que inicializa los atributos con datos pasados por parámetros.
     * @param mtricula Matrícula del velero.
     * @param eslora Medida del largo del velero.
     * @param ano Año de fabricación del velero.
     * @param propietario Dueño del velero.
     * @param potencia Potencia del yate.
     * @param nCamarotes Número de camarotes del yate.
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int nCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        numCamarotes = nCamarotes;
    }
    
    /**
     * Muestra la información del objeto.
     * @return Cadena con la información sobre el objeto.
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
     * @return Potencia del yate + el número de camarotes.
     */
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + numCamarotes;
    }
    
}
