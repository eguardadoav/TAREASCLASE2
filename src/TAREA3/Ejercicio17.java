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
public class Ejercicio17 {
    Scanner ni = new Scanner(System.in);
       int numero = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numero = ni.nextInt();
      
      if(numero < 0) {
        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (numero < 0);
    
    int suma = 0;
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
    
}
