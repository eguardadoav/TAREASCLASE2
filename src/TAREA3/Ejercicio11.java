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
public class Ejercicio11 {
    Scanner n = new Scanner(System.in);
        int numero;
        System.out.print("Introduzca un número: ");
        numero = n.nextInt();

    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);

  }
    
}
