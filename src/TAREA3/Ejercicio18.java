/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA3;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio18 {
     Scanner n = new Scanner(System.in);
        
        int num1;
    int num2;
    
    
    do {
      System.out.print("Introduzca un número entero: ");
      num1 = n.nextInt();
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      num2 = n.nextInt();
      
      if(num1 == num2) {
        System.out.println("Los números introducidos no son válidos, deben ser distintos.");
      }
    } while (num1 == num2);
    
   
    if (num1 > num2) {
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }
    
    for(int i = num1; i <= num2; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
}
