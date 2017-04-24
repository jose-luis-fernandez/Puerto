
public class EmbarcacionAMotor extends Barco
{
    
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += potencia + "\n";
        return textoADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
}
