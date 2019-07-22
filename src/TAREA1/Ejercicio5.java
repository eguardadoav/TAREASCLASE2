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
public class Ejercicio5 {
    Scanner rect = new Scanner(System.in);
        int base, alt, area;
        System.out.print("Ingrese la BASE del Rectangulo: ");
        base = rect.nextInt();
        System.out.print("Ingrese la ALTURA del Rectangulo: ");
        alt = rect.nextInt();
        area = base * alt;
        System.out.println("El area de su Rectangulo es de: " + area + " mts2");
    
}
