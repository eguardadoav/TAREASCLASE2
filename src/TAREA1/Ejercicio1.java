/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio1 {
    int numero1;
        int numero2;
        int resultado;
        BufferedReader num;
        num = new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Introduce el primer numero: ");
       numero1 = Integer.parseInt(num.readLine());
       System.out.println("Introduce el segundo numero: ");
       numero2 = Integer.parseInt(num.readLine());
       resultado = numero1 * numero2;
       System.out.println("La multiplicacion es " + numero1 + " * " + numero2 + " = " + resultado );
    
}
