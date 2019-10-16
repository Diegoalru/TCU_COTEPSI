package clase_3_10_8;

public class Clase_3_10_8 {

    public static void main(String[] args) 
    {
        
        //Matrices:
        
        String Saludo = "Bienvenido"; 
        
        for (int i = 0; i < Saludo.length(); i++) 
        {
            System.out.println("Letra: " + Saludo.charAt(i) + ", Posición: " + i);
        }
        
        
        //Parte 2:
        int[] num = new int[4];

        for (int i = 0; i < num.length; i++) 
        {
            num[i] = (int) Math.pow(2, i);
        }

        for(int dato: num){
                System.out.println(dato);
        }

        
        
        
    }

}
