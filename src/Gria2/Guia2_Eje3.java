/*EJERCICIO 8 MATERIAL DE LECTURA
Escriba un programa que valide si una nota está  entre 0 y 10, 
sino está  entre 0 y 10 la nota se pedirá de nuevo hasta 
que la nota sea correcta.

 */
package Gria2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("Ingrese una nota entre 0 y 10 por favor");
            nota = leer.nextInt();
            
        } while (nota<0 || nota > 10);
        
         System.out.println("La nota "+nota+" esta dentro de los permitidos");      
    }
   
}
