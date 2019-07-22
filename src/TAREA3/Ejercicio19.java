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
public class Ejercicio19 {
    Scanner p = new Scanner(System.in);
        int altura;
        String relle;
         int planta = 1;
    int longitudDeLinea = 1;
    int espacios;
       System.out.print("Introduzca la altura de la pirámide: ");
       altura = p.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    relle = p.nextLine();
    espacios = altura-1;
   
    
    while (planta <= altura) {
      
     
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relle);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;

      
    }
     
    }

