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
public class Ejercicio15 {
    Scanner pir = new Scanner(System.in);
        String s;
        int ops;
        System.out.print("Introduzca el simbolo de relleno para su piramide: ");
        s = pir.nextLine();
        System.out.println("Tipos de Piramide: ");
        System.out.println("1. Vertice hacia arriba");
        System.out.println("2. Vertice hacia abajo");
        System.out.println("3. Vertice hacia la izquierda");
        System.out.println("4. Vertice hacia la derecha");
        ops = pir.nextInt();
        switch (ops)
        {
            case 1:
                System.out.println("  " + s);
	        System.out.println(" " + s + s + s);
	        System.out.println(s + s + s + s + s);
	        break;
                 case 2:
	        System.out.println(s + s + s + s + s);
	        System.out.println(" " + s + s + s);
	        System.out.println("  " + s);
	        break;
                case 3:
	        System.out.println("    " + s);
	        System.out.println("  " + s + " " + s);
	        System.out.println(s + " " + s + " " + s);
	        System.out.println("  " + s + " " + s);
	        System.out.println("    " + s);
	        break;
                case 4:
	        System.out.println(s);
	        System.out.println(s + " " + s);
	        System.out.println(s + " " + s + " " + s);
	        System.out.println(s + " " + s);
	        System.out.println(s);
	        break;
	
                
        }
    
}
