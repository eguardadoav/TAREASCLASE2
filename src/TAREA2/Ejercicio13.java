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
public class Ejercicio13 {
   Scanner or = new Scanner(System.in);
        int espacio;
        int n1, n2, n3;
        System.out.println("Introduzca los 3 numeros: ");
        n1 = or.nextInt();
        n2 = or.nextInt();
        n3 = or.nextInt();
        if (n1 > n2){
            espacio = n1;
            n1 = n2;
            n2 = espacio;
        }
         if (n2 > n3){
            espacio = n2;
            n2 = n3;
            n3 = espacio;
        }
          if (n1 > n2){
            espacio = n1;
            n1 = n2;
            n2 = espacio;
        }
          System.out.println("ORDENADOS: "+ n1 + " , " + n2 + " y " + n3);
       
}
