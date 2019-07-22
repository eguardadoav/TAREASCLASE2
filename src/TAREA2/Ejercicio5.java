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
public class Ejercicio5 {
    Scanner ec = new Scanner(System.in);
       int a, x, b;
       System.out.print("Ingrese el valor de A: ");
       a = ec.nextInt();
       System.out.print("Ingrese el valor de B: ");
       b = ec.nextInt();
       if (a != 0){
           x = - b / a;
           System.out.println("Solucion: " + x);
           
       }
       else if(b != 0){
           System.out.println("NO SE PUEDE SOLUCIONAR");
                  
       }
       else {
           System.out.println("INDETERMINADO");
       }
    
}
