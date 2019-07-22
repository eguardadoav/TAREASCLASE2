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
public class Ejercicio10 {
    Scanner con = new Scanner(System.in);
        int mb;
        int kb = 1000;
        int convr;
        System.out.print("Ingrese la cantidad de Megabyte: ");
        mb = con.nextInt();
        convr = mb * kb;
        System.out.print("La cantidad de Kilobyte es: " + convr + "\n" );
    
}
