/*
 Escriba un programa que lea 20 números. Si el número leído es 
igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó 
el numero cero".  El programa deberá calcular y mostrar el resultado 
de la suma de los números leídos, pero si el número es negativo no 
debe sumarse. Nota: recordar el uso de la sentencia break.

 */
package Gria2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num;
        int conteo = 0;
        
        for (int i = 0; i < 20; i++) {
            
            System.out.println("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            conteo+=1;
            
            if  (num == 0)  { 
                System.out.println("Se capturó el numero cero");
                break;
                } else if (num < 0 ) { 
                continue;
                } else if (num > 0 ); {
                         suma+=num;
                            
                            
                        
            
            }           
            }
            
          
        System.out.println("Se ingresaron "+conteo+ " numeros y la suma es "+suma);
        
    }
    }

