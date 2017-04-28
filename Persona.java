
/**
 * Clase que contiene los datos de un dueño de un barco.
 * @author Jose Luis Fernández Cañón
 * @version Version: 28/04/2016
 */
public class Persona
{
    
    private String nombre;
    private String dni;
    
    /**
     * Constructor que inicializa los atributos con datos pasados por parámetros.
     * @param nombre Nombre de la persona.
     * @param dni DNI de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Muestra la información del objeto.
     * @return Cadena con la información sobre el objeto.
     */
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += nombre + "\n";
        textoADevolver += dni + "\n";
        return textoADevolver;
    }
    
}
