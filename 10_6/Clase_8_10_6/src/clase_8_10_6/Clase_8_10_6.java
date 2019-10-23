/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_8_10_6;

/**
 *
 * @author diego
 */
public class Clase_8_10_6 {

    public static void main(String[] args) {
        //Introduccion a POO
        
        Automovil a = new Automovil();
        a.CC = 1600;
        a.Color = "Rojo";
        a.Placa = "AAA-000";
        a.Puertas = 4;
        a.Year = 2019;

        Automovil a2 = new Automovil();
        a2.CC = 1901;
        a2.Color = "Verde";
        a2.Placa = "ZZZ-999";
        a2.Puertas = 2;
        a2.Year = 2015;

        a.DatosAuto(a.CC, a.Color, a.Placa, a.Year, a.Puertas);
        System.out.println("********************");
        a.DatosAuto(a2.CC, a2.Color, a2.Placa, a2.Year, a2.Puertas);
    }
}
