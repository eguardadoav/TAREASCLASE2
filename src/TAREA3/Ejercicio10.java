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
public class Ejercicio10 {
     Scanner m = new Scanner(System.in);
         double numeros = 0;
    double numeroi = 0;
    double suma = 0;

   
    System.out.println("Introduzca los numeros (para cuando introduce un numero negativo):");

    while (numeroi >= 0) {
      numeroi = m.nextDouble();
      numeros++;
      suma += numeroi;
    }
    
    System.out.println("La media de los números es " + (suma - numeroi)/ (numeros - 1));

}
