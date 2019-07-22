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
public class Ejercicio14 {
     Scanner n = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un numero entero: ");
        num = n.nextInt();
        if ((num % 2) == 0){
            System.out.print("ES PAR");
        }
        else {
            System.out.print("ES IMPAR");
        }
        if ((num % 5) == 0){
            System.out.println(" Y DIVISIBLE ENTRE 5");
        }
        else {
            System.out.println(" Y NO ES DIVISIBLE ENTRE 5");
        }
    
}
