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
public class Ejercicio8 {
     Scanner nm = new Scanner(System.in);
        int nt;
        System.out.print("Introduzca un número entero: ");
        nt = nm.nextInt();  
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(nt + " x " + i + " = " + nt * i);
    }
    
}
