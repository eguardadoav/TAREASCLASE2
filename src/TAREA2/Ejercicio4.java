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
public class Ejercicio4 {
     Scanner hrs = new Scanner(System.in);
        int horas;
        int sueldo;
        System.out.print("Introduzca el numero de horas que trabajo en la semana: ");
        horas = hrs.nextInt();
        if (horas < 40 )
        {
            sueldo = horas * 12;
        }
        else {
            sueldo = (40*12) + ((horas - 40) *16);
        }
        System.out.println("Su sueldo semanal es de: " + sueldo + " euros");
}
