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
public class Ejercicio1 {
     Scanner ds = new Scanner(System.in);
       
        String dias;
        System.out.print("Introduzca un dia de la semana: ");
        dias = ds.nextLine();
        
        switch(dias) {
            case "Lunes":
                System.out.println("Microeconomia");
                break;
            case "Martes":
                System.out.println("Programacion");
                break;
            case "Miercoles":
                System.out.println("Calculo II");
                break;
            case "Jueves":
                System.out.println("Estadistica I");
                break;
            case "Viernes":
                System.out.println("Fisica II");
                break;
            case "Sabado":
                System.out.println("ESTE DIA NO HAY CLASES :) ");
                break;
                case "Domingo":
                System.out.println("ESTE DIA NO HAY CLASES :) ");
                break;
    
}
