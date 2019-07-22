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
public class Ejercicio6 {
    Scanner alt = new Scanner(System.in);
       double h;
       double g = 9.81;
       
       System.out.print("Introduzca la altura en metros: ");
       h = alt.nextInt();
       double solu = Math.sqrt(2*h/g);
       System.out.println("El objeto tarda " +solu+" segundos en caer" );
          
}
