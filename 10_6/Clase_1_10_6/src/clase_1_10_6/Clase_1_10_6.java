/*
 * Proyecto que obtiene un numero del usuario y se realizan operaciones matematicas.
 */
package clase_1_10_6;

import java.util.Scanner;

/**
 *
 * @author Diego Rubi Salas
 * @version 2
 */
public class Clase_1_10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        final float num = 20;     //Variable con dato constante.
        float numUser;      //Dato del usuario.
        float resultado;    //Variable que almacenara los resultados.

        //Creamos una instancia de la clase Scanner.
        Scanner sc = new Scanner(System.in);

        //Solicitamos el dato al usuario
        System.out.print("Ingrese un numero: ");
        numUser = sc.nextInt();

        //Realizar los calculos e imprimir los resultados.
        /*
         * Guardamos el resultado de cada operacion en la variable resultado.
         * Esto con el fin de poder almacenar el resultado y poder utilizarlo en otra parte del codigo.
         */
        resultado = num + numUser;
        System.out.println("El resultado de la suma es: " + resultado);

        resultado = num - numUser;
        System.out.println("El resultado de la resta es: " + resultado);

        /*
         * Para la division se requiere que almenos una de las variables sea flotante, 
         * esto para que pueda mostrar sus decimales.
         * 
         * En caso de que no exista ninguna variable de tipo flotante, se puede castear de la siguente forma:
         *  resultado = (float) num / numUser;
         * Nota: Para esto es siempre nesesario que la variable resultado sea flotante.
         */
        resultado = num / numUser;
        System.out.println("El resultado de la división es: " + resultado);

        resultado = num * numUser;
        System.out.println("El resultado de la multiplicación es: " + resultado);

        resultado = num % numUser;
        System.out.println("El resultado de la multiplicación es: " + resultado);

    }//Fin del Main.

}//Fin de la clase.
