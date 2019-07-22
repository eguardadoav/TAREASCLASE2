/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA3;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio22 {
    System.out.print("Números primos entre 2 y 100: ");

    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {

      
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
    
}
