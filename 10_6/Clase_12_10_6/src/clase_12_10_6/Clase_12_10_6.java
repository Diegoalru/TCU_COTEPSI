package clase_12_10_6;

/**
 * Clase #12. Tema: SWITCH
 * Metodos para encriptar o desencriptar un mensaje.
 * @author Diego
 */
public class Clase_12_10_6 {

    public static void main(String[] args) {
        String Texto = "Hola";              //Texto que se desea encriptar.
        String Dato = Texto.toUpperCase();  //Pasamos el todo el texto a mayusculas.
        String DatoEncriptado;              //Variable donde se almacenara el mensaje encriptado.

        /*Llamando a la función Encripta(), le asignamos valor a DatoEncriptado.*/
        DatoEncriptado = Encripta(Dato);    //Dato es el texto que deseamos encriptar.

        /*Ahora mostramos el texto encriptado por consola*/
        System.out.println("Mensaje Encriptado: " + DatoEncriptado);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+
        //              Pasos para desencriptar
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~+
        
        String DatoDesencriptado = "";     //Variable que almacenara el mensaje ya desencriptado

        //Llamamos a la Función Desencrita(), dandole como parametro un mensaje ya encriptado.
        DatoDesencriptado = Desencripta(DatoDesencriptado); //Le damos valor a la variable.

        System.out.println("Mensaje Desencriptado: " + DatoDesencriptado);//Mostramos el Mensaje.
    }

    /**
     * Realiza la encriptación del mensaje.
     *
     * @param mensaje Mensaje que se desea encriptar.
     * @return Retorna el mensaje encriptado.
     */
    public static String Encripta(String mensaje) {
        String Resultado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            switch (mensaje.charAt(i)) {
                case 'A':
                    Resultado += "A";
                    break;
                case 'B':
                    Resultado += "E";
                    break;
                case 'C':
                    Resultado += "I";
                    break;
                case 'D':
                    Resultado += "M";
                    break;
                /*
                    Demas.... VER IMAGEN QUE SE ENCUENTRA EN PAQUETE: IMG >> "Lines.jpg". ¡VER SOLO LINEAS IMPARES!
                 */
                default:
                    break;
            }
        }
        return Resultado;
    }

    /**
     * Realiza la desencriptación del mensaje.
     *
     * @param mensaje Mensaje encriptado
     * @return Retorna el mensaje desencriptado.
     */
    public static String Desencripta(String mensaje) {
        String Resultado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            switch (mensaje.charAt(i)) {
                case 'A':
                    Resultado += "A";
                    break;
                case 'E':
                    Resultado += "B";
                    break;
                case 'I':
                    Resultado += "C";
                    break;
                case 'M':
                    Resultado += "D";
                    break;
                /*
                    Demas.... VER IMAGEN QUE SE ENCUENTRA EN PAQUETE: IMG >> "Lines.jpg". ¡VER SOLO LINEAS IMPARES!
                 */
                default:
                    break;
            }
        }
        return Resultado;
    }
}
