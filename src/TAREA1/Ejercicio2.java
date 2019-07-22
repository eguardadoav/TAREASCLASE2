/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA1;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio2 {
    double euros;
        int pesetas = 166;
        double conver;
        Scanner ep = new Scanner(System.in);
       
        
       System.out.print(" Ingrese los euros: ");
       euros = ep.nextInt();
       conver = euros * pesetas;
       
       System.out.println("€ " + euros + " = " + conver + " pts.");
    
}
