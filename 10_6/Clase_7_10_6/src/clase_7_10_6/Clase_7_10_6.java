package clase_7_10_6;

import java.util.Scanner;

public class Clase_7_10_6 {

    //Objeto Scanner.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Ejecutar();                             //Llama al metodo que contiene el procedimiento.
    }//End Main    

    public static void Ejecutar() {
        Metodos metodos = new Metodos();        //Llamar a la clase que contiene los metodos.
        int opcion;                             //Variable que posee la opcion del usuario.
        do {
            int num1, num2;                     //Variables que almacenaran los resutados.
            System.out.println("1- Suma.\n2- Resta\n3- Multi\n4- Division.\n5- Salir");     //Mensaje para el usuario.
            opcion = scanner.nextInt();         //Asignacion de valor del usuario.
            switch (opcion) {
                case 1:                         //Suma
                    System.out.println("Ingrese el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado es: " + metodos.Suma(num1, num2));
                    break;
                case 2:                         //Resta
                    System.out.println("Ingrese el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado es: " + metodos.Resta(num1, num2));
                    break;
                case 3:                         //Multiplicacion
                    System.out.println("Ingrese el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado es: " + metodos.Multiplicacion(num1, num2));
                    break;
                case 4:                         //Division
                    System.out.println("Ingrese el primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado es: " + metodos.Division(num1, num2));
                    break;
            }
            System.out.println("\n");           //Salto de linea final.
        } while (opcion != 5);                  //En caso de que la opcion sea 5, se sale del programa.
    }//End Ejecutar.
    
}//End Class
