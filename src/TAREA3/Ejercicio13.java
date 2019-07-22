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
public class Ejercicio13 {
    Scanner p = new Scanner(System.in);
        int neg = 0;
        int pos = 0;
        System.out.println("Introduzca 10 números enteros: ");
        

    
    
    for (int i = 0; i < 10; i++) {
      if (p.nextInt() < 0) {
        neg++;
      } else {
        pos++;
      }
    }
    
    System.out.println("Ha introducido " + pos + " positivos y " + neg + " negativos");
}
