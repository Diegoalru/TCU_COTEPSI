package clase_4_10_8;

public class Persona 
{
    private final int Id = 123456789;
    private String Nombre;
    private int Edad;
    
    public void Saludar(String nombre)
    {
        System.out.println("Hola " + nombre);
    }
    
    private int GetId()
    {
        return Id;
    }
}
