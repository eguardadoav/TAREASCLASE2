/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA1;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio4 {
    Scanner ope = new Scanner(System.in);
      int num1, num2;
      int sum, rest, mult;
      double div;
      System.out.print("Ingrese el primer numero: ");
      num1 = ope.nextInt();
      System.out.print("Ingrese el segundo numero: ");
      num2 = ope.nextInt();
      sum = num1 + num2;
      rest = num1 - num2;
      mult = num1 * num2;
      div = num1 / num2;
      System.out.print("Suma = " + sum + "\n");
      System.out.print("Resta = " + rest + "\n");
      System.out.print("Multiplicacion = " + mult + "\n");
      System.out.print("Division = " + div + "\n");
    
}
