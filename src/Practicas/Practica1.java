/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author osantillan
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Random r = new Random();
        for (int i = 0; i < 26; i++) {
            
        
char c = (char)(r.nextInt(26) + 'A'); 

        System.out.println(" el caracter es: "+ c);
      }

      
        
    }

}

    
    

 
