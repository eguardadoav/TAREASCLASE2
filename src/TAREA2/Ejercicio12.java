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
public class Ejercicio12 {
     Scanner pre = new Scanner(System.in);
       int pts = 0;
       String resp;
       System.out.println("CUESTIONARIO PROGRAMACION II");
       System.out.println("IF, ELSE, FOR Y WHILE son...");
       System.out.println("a) Funciones de acceso a datos\nb) Sentencias de Control\nc) Tipos de Datos");
       System.out.print("R// ");
       resp = pre.nextLine();
       if (resp.equals("b")){ pts++;}
       System.out.println("INT, CHAR, FLOAT, STRING Y BOOLEAN son...");
       System.out.println("a) Funciones de acceso a datos\nb) Sentencias de Control\nc) Tipos de Datos");
       System.out.print("R// ");
       resp = pre.nextLine();
       if (resp.equals("c")){ pts++;}
       System.out.println("LA LETRA A MAYUSCULA EN EL CODIGO ASCII es...");
       System.out.println("a) 32\nb) 65\nc) 97");
       System.out.print("R// ");
       resp = pre.nextLine();
       if (resp.equals("b")){ pts++;}
       System.out.println("MEMORIA VOLATIL...");
       System.out.println("a) RAM\nb) EPROM\nc) ROM");
       System.out.print("R// ");
       resp = pre.nextLine();
       if (resp.equals("a")){ pts++;}
       
       System.out.println("Has obtenido " + pts + " puntos");
    
}
