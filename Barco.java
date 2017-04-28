
/**
 * Clase que contiene los datos gen�ricos para todos los barcos del programa.
 * @author Jose Luis Fern�ndez Ca��n
 * @version Version: 28/04/2016
 */
public abstract class Barco
{
    
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    /**
     * Constructor que inicializa los 4 atributos con datos pasados como par�metros.
     * @param matricula Matricula del barco.
     * @param eslora Medida del largo del barco.
     * @param ano A�o de fabricaci�n del barco.
     * @param propietario Due�o del barco.
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
    }
    
    /**
     * Muestra la informaci�n del objeto.
     * @return Cadena con la informaci�n sobre el objeto.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += propietario.toString();
        textoADevolver += matricula + "\n";
        textoADevolver += eslora + "\n";
        textoADevolver += anoFabricacion + "\n";
        return textoADevolver;
    }
    
    /**
     * M�todo que devuelve la eslora del barco.
     * @return Medida de la eslora.
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * M�todo abstracto.
     */
    public abstract int getCoeficienteBernua();
    
}