/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_2_10_8;

/**
 *
 * @author diego
 */
public class Clase_2_10_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        int contador = 0;
        
        //Ejemplo #1
        while(contador <= 10)
        {
            Thread.sleep(1000);
            System.out.println("Contador: " + contador);
            contador++;
        }

        //Ejemplo #2
        do {
            Thread.sleep(100);
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);
        
    }
    
}
