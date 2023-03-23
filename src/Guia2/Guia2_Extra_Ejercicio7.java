/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Guia2_Extra_Ejercicio7 {

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
        while (i < n) {
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

        }
        System.out.println("El valor minimo es: " + valorminimo);
        System.out.println("el valor maximo es: " + valormaximo);
        System.out.println("El promedio es igual a:" + (promedio));
    }
}
