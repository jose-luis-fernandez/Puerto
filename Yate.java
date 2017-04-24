
public class Yate extends EmbarcacionAMotor
{
    
    private int numCamarotes;
    
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int nCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        numCamarotes = nCamarotes;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += numCamarotes + "\n";
        return textoADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + numCamarotes;
    }
    
}
