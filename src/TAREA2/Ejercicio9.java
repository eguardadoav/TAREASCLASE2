/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA2;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio9 {
    Scanner ecs = new Scanner(System.in);
       double x1, x2;
       double a, b , c;
       
       System.out.println("Introduzca los valores: ");
       System.out.print("a = ");
       a = ecs.nextInt();
       System.out.print("b = ");
       b = ecs.nextInt();
       System.out.print("c = ");
       c = ecs.nextInt();
       if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
       if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    }
       if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    }
       if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    }
       double ds = b * b- (4 * a* c);
       if (ds < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(ds))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(ds))/(2 * a));
      }
}
