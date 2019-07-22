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
public class Ejercicio2 {
    Scanner hr = new Scanner(System.in);
        int hora;
        System.out.print("Introduzca una hora del día: ");
        hora = hr.nextInt();
  
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("La hora introducida no es correcta.");
                
    }}
    

