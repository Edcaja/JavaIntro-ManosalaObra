/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class Guia6Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n1;
      int n2;
      int sum;
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = leer.nextInt();
        sum = n1+n2;
        System.out.println("la suma del numero "+n1+ " y del numero "+n2+ " es : " +sum);
                
    }
    
}
