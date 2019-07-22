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
public class Ejercicio9 {
    Scanner nd = new Scanner(System.in);
       int numeroDeDigitos = 1, n, numero;

    System.out.print("Introduzca un número entero de varios digitos: ");
    numero = nd.nextInt();
    
    n = numero;
    
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numero + " tiene " + numeroDeDigitos + " dígitos.");
}
