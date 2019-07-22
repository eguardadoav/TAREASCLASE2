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
public class Ejercicio8 {
    Scanner hr = new Scanner(System.in);
        int horas;
        int total;
        System.out.print("¿Cuántas horas trabajó en la semana?: ");
        horas = hr.nextInt();
        total = horas * 12;
        System.out.print("Su salario es de: € " + total + "\n");
    
}
