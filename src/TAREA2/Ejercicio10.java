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
public class Ejercicio10 {
    Scanner hor = new Scanner(System.in);
       int dia;
       int mes;
       System.out.print("Que dia naciste? ");
       dia = hor.nextInt();
       System.out.print("Que mes naciste? ");
       mes = hor.nextInt();
       switch (mes)
       {
           case 1:
               if(dia>=21)
                   System.out.println("CAPRICORNIO");
               else
                   System.out.println("ACUARIO");
                  
               break;
                case 2:
               if(dia>=20)
                   System.out.println("PISCIS");
               else
                   System.out.println("ACUARIO");
                  
               break;
                case 3:
               if(dia>=21)
                   System.out.println("ARIES");
               else
                   System.out.println("PISCIS");
                  
               break;
                case 4:
               if(dia>=20)
                   System.out.println("TAURO");
               else
                   System.out.println("ARIES");
                  
               break;
                case 5:
               if(dia>=21)
                   System.out.println("GEMINIS");
               else
                   System.out.println("TAURO");
                  
               break;
                case 6:
               if(dia>=20)
                   System.out.println("CANCER");
               else
                   System.out.println("GEMINIS");
                  
               break;
                case 7:
               if(dia>=21)
                   System.out.println("LEO");
               else
                   System.out.println("CANCER");
                  
               break;
                case 8:
               if(dia>=20)
                   System.out.println("VIRGO");
               else
                   System.out.println("LEO");
                  
               break;
                case 9:
               if(dia>=21)
                   System.out.println("LIBRA");
               else
                   System.out.println("VIRGO");
                  
               break;
                case 10:
               if(dia>=20)
                   System.out.println("ESCORPIO");
               else
                   System.out.println("LIBRA");
                  
               break;
                case 11:
               if(dia>=21)
                   System.out.println("SAGITARIO");
               else
                   System.out.println("ESCORPIO");
                  
               break;
                case 12:
               if(dia>=20)
                   System.out.println("CAPRICORNIO");
               else
                   System.out.println("SAGITARIO");
                  
               break;
    
}
