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
public class Ejercicio11 {
    Scanner se = new Scanner(System.in);
       int hora, min, segstrans, segsrest;
       System.out.println("INTRODUZCA LA HORA");
       System.out.print("Hora: ");
       hora = se.nextInt();
       System.out.println("Minutos: ");
       min = se.nextInt();
       segstrans = (hora * 3600) + (min * 60);
       segsrest = (24 * 3600) - segstrans;
       System.out.println("Desde las " +hora+ ":" +min+ " hasta la medianoche faltan " + segsrest+ " segundos");
    
}
