/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA3;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class Ejercicio23 {
    Scanner e = new Scanner(System.in);
         int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
     System.out.println("Vaya introduciendo números");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
   
    
    do {
      numeroIntroducido = e.nextInt();
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
}
