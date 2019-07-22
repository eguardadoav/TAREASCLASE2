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
public class Ejercicio7 {
    Scanner cj = new Scanner(System.in);
     int intentos = 4;
    int ni;
    boolean acertado = false;
    
    do {
      System.out.print("INTRODUCE LA CLAVE: ");
      ni = cj.nextInt();
      
      if (ni == 1234) {
        acertado = true;
      } else {
        System.out.println("CLAVE INCORRECTA");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("HAS ABIERTO LA CAJA FUERTE");
    } else {
      System.out.println("AGOTASTE LAS 4 OPORTUNIDADES");
    }
    
}
