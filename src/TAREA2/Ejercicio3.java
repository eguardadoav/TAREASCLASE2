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
public class Ejercicio3 {
    Scanner ds =new Scanner(System.in);
      String Dia[]={"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
      System.out.println("Ingrese un numero: ");
      int d= ds.nextInt();
      if(d >= 1 && d <= 7){
          System.out.println("El dia "+ d +" es "+ Dia[d-1]);
      }else{
          System.out.println("NO ES UN DIA DE LA SEMANA :( ");
      }     
      }
    
}
