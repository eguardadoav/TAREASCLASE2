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
public class Ejercicio20 {
    Scanner p = new Scanner(System.in);
        int alturaIntroducida;
        String relleno;
        int altura = 1;
    int i = 0;
    int espaciosPorDelante;
    int espaciosInternos = 0;
       System.out.print("Introduzca la altura de la pirámide: ");
    alturaIntroducida = p.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    relleno = p.nextLine();
    espaciosPorDelante = alturaIntroducida - 1;
    
    
    while (altura < alturaIntroducida) {
      
      
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } 
            
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
    
}
