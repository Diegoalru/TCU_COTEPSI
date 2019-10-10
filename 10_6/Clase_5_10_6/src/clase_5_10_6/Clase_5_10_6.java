package clase_5_10_6;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Clase_5_10_6 {

    public static void main(String[] args) {
        //Ejemplo #1
        int cont = 0;
        while (cont <= 10) {
            System.out.println("El doble de " + cont + " es " + (cont * 2));
            cont++;
        }

        //Ejemplo #2
        for (int i = 0; i <= 15; i++) {
            System.out.println("El doble de " + i + " es " + (i * 2));
        }

        //Ejemplo #3
        List list = new LinkedList();
        list.add(0, "Mensaje_1");
        list.add(1, "Mensaje_2");
        list.add(2, "Mensaje_3");
        list.add(3, "Mensaje_4");
        for (int i = 0; i <= 3; i++) {
            System.out.println(list.get(i));
        }
        
        //Ejemplo #4
        for (int i = 0; i <= 20; i++)
        {
            if(i <= 5){
                System.out.println("Azul");
            }else if(i <= 10){
                System.out.println("Rojo");
            }
            
        }
         

        /*
         * TEMA: Arreglos.
         *  Es una colección de datos del mismo tipo. Esto significa que podremos almacenar la cantidad de datos que se deseen siempre
         *  y cuando sean los mismos tipos de datos primitivos (int, String, char, boolean, ... ).
         */
        
        //Declaración de una variable.
        int num;                                   
        
        //Declaracion de un arreglo.
        int[] array;                                
        
        /*
         * Declaracion de un arreglo, junto a los valores que este contendrá. 
         * En este caso solo se podran cambiar los datos almacenados pero no agregar mas.
         */
        int[] array_1 = {1,6,7,90};                 
        
        /*
         * Declaración de un arreglo y la cantidad de datos que este podrá almacenar.
         */
        int[] array_2 = new int[8];
        
        /*
         * Ejemplo de como recorrer un arreglo y asignarle un valor a cada posición.
         */
        for (int j = 0; j < array_2.length; j++) {
            array_2[j] = j * 2;
            System.out.println(array_2[j]);
        }
    }//Fin del main.
}//Fin de la clase.
