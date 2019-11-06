package clase_11_10_6;

import java.util.Scanner;

public class Clase_11_10_6 {

    public static void main(String[] args) {
            
    }

    /**
     * Ejercicio que pida dos numeros, los sume y muestre su resultado.
     */
    private static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite un numero: ");
        n1 = sc.nextInt();

        System.out.print("Digite otro numero: ");
        n2 = sc.nextInt();

        System.out.println("La suma es: " + (n1 + n2));
    }

    /**
     * Ejercicio que pida un numero y muestre si es positivo o negativo y si es
     * par o impar.
     */
    private static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        int n;
       
        System.out.print("Digite un numero: ");
        n = sc.nextInt();
        
        if(n > 0 )
            System.out.println("Es positivo");
        else
            System.out.println("Es negativo");
        
        if((n % 2) == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
