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
public class Ejercicio7 {
    Scanner not = new Scanner(System.in);
       double nota1, nota2, nota3, media;
       System.out.print("Ingrese su primer nota: ");
       nota1 = not.nextInt();
       System.out.print("Ingrese su segunda nota: ");
       nota2 = not.nextInt();
       System.out.print("Ingrese su tercer nota: ");
       nota3 = not.nextInt();
       media = (nota1 + nota2 + nota3)/3;
       System.out.println("La media es: " +media);
}
