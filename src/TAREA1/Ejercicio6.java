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
public class Ejercicio6 {
    Scanner tri = new Scanner(System.in);
        int base, alt; 
        double area;
        System.out.print("Ingrese la BASE del Triangulo: ");
        base = tri.nextInt();
        System.out.print("Ingrese la ALTURA del Triangulo: ");
        alt = tri.nextInt();
        area = (base * alt)/2;
        System.out.println("El area de su Triangulo es de: " + area + "");
    
}
