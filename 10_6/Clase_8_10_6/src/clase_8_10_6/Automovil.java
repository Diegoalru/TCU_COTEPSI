/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_8_10_6;

/**
 *
 * @author diego
 */
public class Automovil 
{
    //Variables
    public int Puertas;
    public int CC;
    public String Color;
    public String Placa;
    public int Year;      
    
    //Metodos
    public void DatosAuto(int cc, String color, String placa, int year, int puertas )
    {
        System.out.println("Cilindraje: " + cc);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        System.out.println("Año: " + year);
        System.out.println("Puertas: " + puertas);
    }
    
}
