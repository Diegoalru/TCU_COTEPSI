/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_1_10_6;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Clase_1_10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        float  num = 20f;
        int numUser;
        float resultado;

        //Creamos el objeto.
        Scanner sc = new Scanner(System.in);

        //Solicitamos el dato al usuario
        System.out.print("Ingrese un numero: ");
        numUser = sc.nextInt();

        //Muestra Resultados
        resultado = num + numUser;
        System.out.println("El resultado de la suma es: " + resultado);

        resultado = num - numUser;
        System.out.println("El resultado de la resta es: " + resultado);

        resultado = num / numUser;
        System.out.println("El resultado de la división es: " + resultado);

        resultado = num * numUser;
        System.out.println("El resultado de la multiplicación es: " + resultado);

        resultado = num % numUser;
        System.out.println("El resultado de la multiplicación es: " + resultado);

    }

}
