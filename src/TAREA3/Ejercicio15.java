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
public class Ejercicio15 {
    Scanner eb = new Scanner(System.in);
        double base;
        int exponentefinal;
         System.out.print("Introduzca un número real como base: ");
    base = eb.nextDouble();
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    exponentefinal = eb.nextInt();

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponentefinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
    
}
