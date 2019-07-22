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
public class Ejercicio11 {
    Scanner con = new Scanner(System.in);
        int kb;
        double mb = 0.001;
        double convr;
        System.out.print("Ingrese la cantidad de Kilobyte: ");
        kb = con.nextInt();
        convr = kb * mb;
        System.out.print("La cantidad de Megabyte es: " + convr + "\n" );
    
}
