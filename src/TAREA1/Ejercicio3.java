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
public class Ejercicio3 {
    double euros = 0.01 ;
        int pesetas;
        double conver;
        Scanner ep = new Scanner(System.in);
       
        
       System.out.print(" Ingrese las pesetas : ");
       pesetas = ep.nextInt();
       conver = pesetas * euros;
       
       System.out.println("" + pesetas + " pts.  = " + " € "+ conver + "");
    
}
