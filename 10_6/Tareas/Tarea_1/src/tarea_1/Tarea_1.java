package tarea_1;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Tarea_1 {

    public static void main(String[] args) {
        /*
         * Solicitar al usuario su nombre y su edad. Mostrar un saludo y el
         * rango de edad al cual pertenece. 
         */

        /*
         * Variables
         */
        Scanner scanner = new Scanner(System.in);   //Nota: Recuerde importar la libreria (Linea #3).
        String Nombre;                              //Variable que guardara el nombre.
        String rangoEdad = null;                    //Variable que guardara el rango de edad.
        int edad = 0;                               //Variable que guardara la edad.

        System.out.print("Ingrese su nombre: ");    //Mensaje para el usuario.
        Nombre = scanner.next();                    //Guardamos el nombre.

        System.out.print("Ingrese su edad: ");      //Mensaje para el usuario.

        /*
            Try/catch:  Es usado en casos en los que sabemos que el programa es altamente propenso a caer,
                        de esta forma si se genera un error, podemos controlarlo.
         */
        try {
            edad = scanner.nextInt();               //Obtenemos la edad. 
        } catch (Exception e) //En caso de que el usuario ingrese algo que no sea un numero
        {
            //Mensaje de error.
            /*
                Para poder cambiar el color del texto que se muestra en la consola:
                \u001B[31m  -> Color rojo.
                \u001B[0m   -> Volver al color original.
                Para mas información:
                    https://www.campusmvp.es/recursos/post/como-cambiar-los-colores-de-la-consola-con-java-y-system-out-println.aspx
             */
            System.out.println("\n\u001B[31m ¡Error! \u001B[0m" + "\n\nIngresar una valida edad.\nIngresar solo numeros.");

            /*
                Mediante al System.exit(), le indicamos al programa que detenga la ejecución.
                Parametros para el metodo exit().
                    0   ->  En caso de que todo haya terminado correctamente.
                    1   ->  En caso de que exista algun error en tiempo de ejecución.
             */
            System.exit(0);
        }

        /* 
         * Procedimientos:
         */
        System.out.println("Bienvenido " + Nombre);

        if (edad <= -1 || edad >= 121) {
            System.out.println("\n\u001B[31mError\u001B[0m: Edad incorrecta.");
        } else if (edad == 0 && edad <= 2) {
            rangoEdad = "Bebé";
        } else if (edad >= 3 && edad <= 12) {
            rangoEdad = "Niño";
        } else if (edad >= 13 && edad <= 17) {
            rangoEdad = "Adolescente";
        } else if (edad >= 18 && edad <= 30) {
            rangoEdad = "Joven";
        } else if (edad >= 31 && edad <= 64) {
            rangoEdad = "Adulto";
        } else if (edad >= 65 && edad <= 120) {
            rangoEdad = "Anciano";
        }

        if (rangoEdad != null) {
            System.out.println("Su rango de edad es: " + rangoEdad);
        }
    }

}
