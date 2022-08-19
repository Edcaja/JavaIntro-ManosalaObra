/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 *
 * @author egar0
 */
public class Guia6Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num,d,t;
        double raizcuadrada;
        System.out.println("ingrese un numero entero");
        num = leer.nextInt();
        d = num*2;
        t= num*3;
        raizcuadrada = Math.sqrt(num);
        System.out.println("El doble del numero: " +num+ " es : " +d);
        System.out.println("El triple del numero: " +num+ " es : "+t);
        System.out.println("la raiz cuadra  del numero: " +num+ " es : "+raizcuadrada);
    }
    
}
