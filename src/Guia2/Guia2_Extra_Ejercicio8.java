/*
 *Escriba un programa que lea números enteros. Si el número es 
múltiplo de cinco debe detener la lectura y mostrar la cantidad 
de números leídos, la cantidad de números pares y la cantidad de 
números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Numeros: ");
        int n = leer.nextInt();
        int i = 0;
        double promedio = 0;
        int valorminimo = 0;
        int valormaximo = 0;
        double suma = 0;
        do {
            i++;

            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            suma += num;
            promedio = suma / n;

            while (valorminimo == 0) {
                valorminimo = num;
            }

            if (num > valormaximo) {
                valormaximo = num;
            }
            if (num < valorminimo) {
                valorminimo = num;
            }
        } while (i < n);

        System.out.println("El valor minimo es: " + valorminimo);
        System.out.println("el valor maximo es: " + valormaximo);
        System.out.println("El promedio es igual a:" + (promedio));

    }

}
