
/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y 
luego un valor real que represente el costo del tratamiento (previo al 
descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a calcular: ");
        double alturageneral = 0;
        double alturaparcial = 0;
        int contador = 0;
        int personas = leer.nextInt();
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona: ");
            double altura = leer.nextDouble();
            alturageneral += altura;
            
            if (altura < 1.60) {
                alturaparcial += altura;
                contador++;
 }
        }
                System.out.println("Promedio de altura por debajo de 1.60 mts es: " + (alturaparcial / contador));
                System.out.println("El promedio de estaturas en general es: " + (alturageneral / personas));
           
    }
}

