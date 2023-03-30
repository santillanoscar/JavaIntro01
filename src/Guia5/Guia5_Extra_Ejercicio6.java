/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres 
y, a medida que el usuario las va ingresando, construya una “sopa de letras 
para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas 
en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por 
pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

 */
package Guia5;

import java.util.Scanner;


public class Guia5_Extra_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner leer = new Scanner(System.in);
        
         String matriz[][] = new String[20][20];
        
         String palabra = "";
         
         for (int i = 0; i < 20; i++) {
             for (int j = 0; j < 20; j++) {
                 matriz[i][j] = "a";
                 
             }
        }
         
        for (int i = 0; i < 5; i++) {

            do {

                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Ingrese palabra " + (i + 1) + ": ");
                palabra = leer.next().toUpperCase();
                int largoPalabra= palabra.length();
                
                int nroRandom= (int) (Math.random() * 20 + 1);
                matriz[nroRandom][0] = palabra;
               
                
                if (palabra.length() >= 3 || palabra.length() <= 5) {
                   
                    for (int j = 0; j < largoPalabra; j++) {
                        matriz[nroRandom][0] = palabra.substring(0,j);
                        System.out.println(matriz[nroRandom][j]);
                    }
                    
                }

            } while (palabra.length() < 3 || palabra.length() > 5);

        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println("");
            for (int j = 0; j < 20; j++) {
                System.out.print("("+matriz[i][j]+")");
            }
                    
        }

    }

}

         
        
    
    

