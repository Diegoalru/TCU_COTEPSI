/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4_10_6;

/**
 *
 * @author diego
 */
public class Clase_4_10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        long i = 0;
        
        //Ejemplo #1
        while(i <= 10){
            System.out.println("Contador: " + i);
            i++;
        }

        //Ejemplo #2
        do {         
            System.out.println("Contador: " + i);
            i++;
        } while (true);

    }

}
