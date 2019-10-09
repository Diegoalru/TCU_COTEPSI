package clase_3_10_6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Clase_3_10_6 {

    public static void main(String[] args) 
    {

        /*
            Estructura usada:
                                if
            Sintaxis:
                                if( condición )
                                {
                                    En caso de que la condición sea valida.
                                }
                                else
                                {
                                    En caso de que la condición sea invalida.
                                }
        
            Metodos usados:
                          equalsIgnoreCase() -> Compara un String con otro, ignora las mayusculas.
                                                Este metodo velirica que ambos Strings tengan la misma longitud y los mismos caracteres.
                          equals()  ->  Verifica que exista la misma secuencia de caracteres. Este metodo sí valida las mayusculas.
                
        */
        
        //Declaramos las variables
        String User, Pass;

        //Obtener datos del usuario.
        Scanner sc = new Scanner(System.in);            //Crear la instancia de la clase Scanner.
        System.out.print("Ingrese el usuario: ");       //Mensaje para el usuario.
        User = sc.next();                               //Recolectamos el usuario introducido.
        System.out.print("\nIngrese la contraseña: ");  //Mensaje para el usuario.
        Pass = sc.next();                               //Recolectamos la contraseña introducida.

        if (User.equalsIgnoreCase("admin"))             //Validamos el usuario ingresado.
        {
            if (Pass.equals("secretPass"))              //Validamos la contraseña ingresada.
            {
                //En caso de que las credenciales esten correctas
                JOptionPane.showMessageDialog(null, "Bienvenido");  
            }
            else 
            {
                //En caso de que la contraseña sea invalida.
                JOptionPane.showMessageDialog(null, "Contraseña no valida.");
            }
        } else {
            //En caso de que el usuario sea invalido, mostrar un mensaje de error.
            /*
                NOTA:
                    Para que se muestre este mensaje se necesita que solo el usuario sea incorrecto.
                    Esto se debe a que en la linea #45, se verifica unicamente el usuario. 
                    En caso de que el usuario sea incorrecto, el programa saltará a la linea #75 pero, en caso de que el usuario
                    sea correcto este continuara con el flujo normal de ejecución (linea #46), saltandose luego las lineas #57-67.
            */
            JOptionPane.showMessageDialog(null, "Error el usuario o contraseña no validas.");
        }
        
    }//Fin del motodo main.
    
}//Fin de la clase
