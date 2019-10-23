package clase_9_10_6;

import java.util.Scanner;

public class Clase_9_10_6 {

    public static void main(String[] args) {
        Ejemplo_1();
        Ejemplo_2();
    }

    private static void Ejemplo_1() {
        /*
         * EJEMPLO #1
         * Leer un numero e indicar si es negativo o positivo
         * El programa terminara cuando se introduzca 0.
         */

        //Crear el objeto escaner.
        Scanner scanner = new Scanner(System.in);

        //Crear variable que va a almacenar el numero.
        int numero;

        //Codigo a realizar:
        do {

            //Mensaje para el usuario.
            System.out.print("Introduce un numero: ");

            //Guardamos el numero en la variable numero.
            numero = scanner.nextInt();

            //Verificamos que el numero sea menor o igual que -1
            if (numero < 0) {
                System.out.println("Negativo");
            } //Verificamos que el numero sea mayor o igual que 1
            else if (numero > 0) {
                System.out.println("Positivo");
            }
            //En caso de que sea 0, no mostrar nada.

        } while (numero != 0);//En caso de que numero sea 0, termine el ciclo.
    }

    private static void Ejemplo_2() {

        /*
         * EJERCICIO #2
         * Leer un numero e indicar si es par o impar
         */
 /*
            El operador % se le llama el operador de módulo.
            El operador de % calcula el resto después de dividir el primer operando por el segundo.
            Por ejemplo, digamos que estás calculando la división siguiente:
                10 ÷ 3
            Obviamente, el resultado es 3.333333.... o en otras palabras, 3 con un restante de 1. 
            Ese restante es el resultado de usar el operador de módulo:
                10 % 3 = 1    
         */
        //Crear objeto
        Scanner scanner = new Scanner(System.in);

        //Variable que almacenara el numero
        int numero;

        do {

            System.out.println("Ingrese un numero");//Mensaje para el usuario.

            numero = scanner.nextInt();//Guardar el numero

            if ((numero % 2) == 0) {   //Validar que el residuo sea par
                System.out.println("El numero " + numero + " es par.");
            } else {    //En caso de ser impar.
                System.out.println("El numero " + numero + " es impar.");
            }

        } while (numero != 0); //Salir en caso de que sea 0 se termine el programa.

    }
}
