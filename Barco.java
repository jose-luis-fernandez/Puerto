
/**
 * Clase que contiene los datos genéricos para todos los barcos del programa.
 * @author Jose Luis Fernández Cañón
 * @version Version: 28/04/2016
 */
public abstract class Barco
{
    
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    /**
     * Constructor que inicializa los 4 atributos con datos pasados como parámetros.
     * @param matricula Matricula del barco.
     * @param eslora Medida del largo del barco.
     * @param ano Año de fabricación del barco.
     * @param propietario Dueño del barco.
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.propietario = propietario;
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
    }
    
    /**
     * Muestra la información del objeto.
     * @return Cadena con la información sobre el objeto.
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
     * Método que devuelve la eslora del barco.
     * @return Medida de la eslora.
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * Método abstracto.
     */
    public abstract int getCoeficienteBernua();
    
}