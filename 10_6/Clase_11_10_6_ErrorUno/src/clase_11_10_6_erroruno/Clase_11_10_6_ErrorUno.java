/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_11_10_6_erroruno;

/**
 *
 * @author diego
 */
public class Clase_11_10_6_ErrorUno {

    static int n1 = 50;
    
    public static void main(String[] args) 
    {
        int n2 = 30, suma = 0, n3 = 0;
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);
        suma = suma + n3;
        System.out.println(suma);
    }
    
}
