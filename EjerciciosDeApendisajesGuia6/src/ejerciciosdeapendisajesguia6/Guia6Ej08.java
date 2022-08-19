/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 *
 * @author egar0
 */
public class Guia6Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nc;
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        nc = frase.length();
        if(nc <= 8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
