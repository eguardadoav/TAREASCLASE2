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
public class Ejercicio16 {
     Scanner p = new Scanner(System.in);
        int num;
         System.out.print("Introduzca un número entero: ");
         num = p.nextInt();

    boolean esPrimo = true;
    
    for (int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
}
