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
public class Ejercicio7 {
    Scanner tot = new Scanner(System.in);
        double base, total;
        double iva = 0.12;
        System.out.print("Introduzca la base imponible (Precio sin IVA): " );
        base = tot.nextInt();
        total = base * 1.12;
        System.out.print("IVA                                          " +   iva + "\n");
        System.out.println("Total                                        " +   total + "");
}
