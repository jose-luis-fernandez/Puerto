
public class Velero extends Barco
{
    
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int nMastiles)
    {
        super(matricula, eslora, ano, propietario);
        numMastiles = nMastiles;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += numMastiles + "\n";
        return textoADevolver;
    }
    
    public int getCoeficienteBernua()
    {
        return numMastiles;
    }
    
}
