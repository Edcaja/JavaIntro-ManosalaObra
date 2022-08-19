/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Crear un programa que dado un numero determine si es par o impar.
 *
 * @author egar0
 */
public class Guia6Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        num = leer.nextInt();
        if (num%2 ==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
    
}
