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
public class Ejercicio9 {
     Scanner vl = new Scanner(System.in);
        double radio, volum;
        int alt;
        double pi = 3.1416;
        System.out.print("Ingrese el radio del cono: ");
        radio = vl.nextInt();
        System.out.print("Ingrese la altura del cono: ");
        alt = vl.nextInt();
        volum = (pi * (radio *radio)*(alt))/3;
        System.out.print("El volumen del cono es: " + volum + " cm3 \n");
    
}
