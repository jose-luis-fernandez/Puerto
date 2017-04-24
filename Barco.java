
public abstract class Barco
{
    
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += propietario.toString();
        textoADevolver += matricula + "\n";
        textoADevolver += eslora + "\n";
        textoADevolver += anoFabricacion + "\n";
        return textoADevolver;
    }
    
    public double getEslora()
    {
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();
    
}