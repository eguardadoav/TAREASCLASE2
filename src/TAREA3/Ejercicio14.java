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
public class Ejercicio14 {
    Scanner b = new Scanner(System.in);
        int base;
        int exponente;
        System.out.print("Introduzca la base: ");
    base = b.nextInt();
    
    System.out.print("Introduzca el exponente: ");
    exponente = b.nextInt();

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
    
}
