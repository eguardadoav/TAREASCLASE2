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
public class Ejercicio24 {
    Scanner pr = new Scanner(System.in);
     int altura = 1;
    int i = 0;
    int espacios;
    int alturaIntroducida;
    System.out.print("Introduzca la altura de la pirámide:");
    alturaIntroducida = pr.nextInt();
    espacios = alturaIntroducida - 1;
   
    
    while (altura <= alturaIntroducida) {
      
  
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } 
    
}
