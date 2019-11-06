package clase_6_10_8;

import java.util.Scanner;

/**
 * @author diego
 * @version 1
 */
public class Clase_6_10_8 {

    public static Scanner scanner = new Scanner(System.in);//Objeto

    public static void main(String[] args) {

//        String Nombre;
//        System.out.print("Ingrese su nombre: ");
//        Nombre = scanner.next(); //Metodo
//        GetSaludo(Nombre);

        Persona persona1 = new Persona();
        persona1.Nombre = "Diego";
        persona1.edad = 21;
        persona1.ID = 1;

        persona1.GetInfoPersona(persona1.ID,
                persona1.Nombre,
                persona1.edad);

    }

    /**
     * Retona un saludo. (Función)
     *
     * @param Nombre Nombre del usuario.
     * @return Un saludo.
     */
    private static String Saludo(String Nombre) {
        return "Hola " + Nombre;
    }

    /**
     * Muestra el saludo. (Procedimiento)
     */
    public static void GetSaludo(String Nombre) {
        Saludo(Nombre);
    }
}