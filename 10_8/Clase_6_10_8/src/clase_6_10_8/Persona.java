/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_6_10_8;

/**
 *
 * @author diego
 */
public class Persona {
    
    public int ID;
    public String Nombre;
    public int edad;
    
    public void GetInfoPersona(int id, String nombre, int edad)
    {
        System.out.println("Mi nombre es: " + nombre + " y mi edad es: "+ edad);
    }
    
}
