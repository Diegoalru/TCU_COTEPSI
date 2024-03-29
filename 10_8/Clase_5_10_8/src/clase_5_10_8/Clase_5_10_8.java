package clase_5_10_8;

/**
 * @author diego
 */
public class Clase_5_10_8 {

    public static void main(String[] args) {
        /*
        Operadores de condición: 
	
	==	Igual
	!=	Diferente

	<	Menor que
	<=	Menor o igual que

	>	Mayor que
	>=	Mayor o igual que

	Texto1.equals(Texto2)	Comparación de Strings.
	Texto1.equalsIgnoreCase(Texto2)


        1- Verificar que 2 numeros sean iguales.
        2- Buscar el mayor de 2 numeros.
        3- Crear un login donde valide un Id y contraseña. Ambos deben de ser ingresados por el usuario.
         */
        
    }

    /**
     * Compara si los numeros ingresados son iguales.
     */
    private static void ComparaNumeros() {
        //Variables
        int a = 2, b = 3;

        if (a != b) {
            System.out.println("Los numeros son distintos.\n");
        } else {
            System.out.println("Los numeros son iguales.\n");

        }
    }

    /**
     * Encuentra el mayor de 2 numeros.
     */
    private static void EncuentraElMayor() {
        int a = 1, b = 2;

        if (a < b) {
            System.out.println(a + " es menor que " + b + "\n");
        } else if (a > b) {
            System.out.println(a + " es mayor que " + b + "\n");
        } else {
            System.out.println(a + " es igual que " + b + "\n");
        }
    }

    /**
     * Metodo que valida credenciales.
     */
    private static void Login() {
        //Variables.
        java.util.Scanner scanner = new java.util.Scanner(System.in);//Objeto scanner
        int id;                                                 //Id del usuario
        String pass;                                            //Contraseña del usuario

        //Asignación de valor.
        System.out.print("Ingrese su ID: ");                    //Mensaje: Ingrese de Id
        id = scanner.nextInt();                                 //Guardar buffer de Id

        System.out.print("Ingrese se contraseña: ");            //Mensaje: Ingrese contraseña
        pass = scanner.next();                                  //Guardar buffer de la contraseña

        if (id == 1) {                                          //Validar el id
            if (pass.equalsIgnoreCase("admin")) {               //Validar la contraseña
                System.out.println("¡Bienvenido!");             //Mensaje: Inicio de sesión completo
            } else {                                            //En caso de fallar la contraseña
                System.out.println("Contraseña incorrecta.");   //Mensaje: Fallo de contraseña
            }
        } else {                                                //En caso de fallar el id.
            System.out.println("Id no existe.");                //Mensaje: Fallo de Id.
        }
    }//Fin Login

}//Fin Clase
