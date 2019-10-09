package clase_1_10_8;

import java.util.Scanner;

public class Clase_1_10_8 {

    public static void main(String[] args) {

        String msj[] = new String[3];
        msj[0] = "1 año -> ";
        msj[1] = "De 2 a 6 años -> ";
        msj[2] = "7 o mas -> ";

        int at[] = new int[3];
        at[0] = 6;
        at[1] = 14;
        at[2] = 20;

        int log[] = new int[3];
        log[0] = 7;
        log[1] = 15;
        log[2] = 22;

        int ger[] = new int[3];
        ger[0] = 10;
        ger[1] = 20;
        ger[2] = 30;

        System.out.println("Atencion al cliente: ");
        for (int i = 0; i < at.length; i++) {
            System.out.print(msj[i] + at[i] + " dias.\t");
        }

        System.out.println("\n\nLogistica: ");
        for (int i = 0; i < log.length; i++) {
            System.out.print(msj[i] + log[i] + " dias.\t");
        }

        System.out.println("\n\nGerencia: ");
        for (int i = 0; i < ger.length; i++) {
            System.out.print(msj[i] + ger[i] + " dias.\t");
        }

        /////
        //MOSTRAR VACACIONES.
        /////
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Clave del departamento?");
        int clave = scanner.nextInt();
        System.out.println("¿Años de trabajo?");
        int años = scanner.nextInt();
        String Dep = "";
        int vaciones = 0;
        switch (clave) {
            case 1: // Atencion
                Dep = "Atencion al cliente";
                if ((años <= 1) && (años > 0)) {
                    vaciones = at[0];
                } else if ((años >= 2) && (años <= 6)) {
                    vaciones = at[1];
                } else if (años >= 7) {
                    vaciones = at[2];
                } else {
                    vaciones = 0;
                }
                break;

            case 2://Logistica
                Dep = "Logistica";
                if ((años <= 1) && (años > 0)) {
                    vaciones = log[0];
                } else if ((años >= 2) && (años <= 6)) {
                    vaciones = log[1];
                } else if (años >= 7) {
                    vaciones = log[2];
                } else {
                    vaciones = 0;
                }
                break;

            case 3://Gerencia
                Dep = "Gerencia";
                if ((años <= 1) && (años > 0)) {
                    vaciones = ger[0];
                } else if ((años >= 2) && (años <= 6)) {
                    vaciones = ger[1];
                } else if (años >= 7) {
                    vaciones = ger[2];
                } else {
                    vaciones = 0;
                }
                break;
            default:
                break;
        }
        //Mensaje.
        System.out.println("Su departamento es: " + Dep + "\nSus vacaciones: " + vaciones);
    }
}
