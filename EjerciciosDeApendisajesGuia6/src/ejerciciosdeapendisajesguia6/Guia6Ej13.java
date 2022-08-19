/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 *
 * @author egar0
 */
public class Guia6Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Nlado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de lados del cuadrado");
        Nlado = leer.nextInt();
        for (int i = 0; i<Nlado;i++){
            System.out.print("*");
        }
        System.out.println("");
        //armar el centro del cuadrado
        for(int i= 0;i<Nlado-2;i++){
            System.out.print("*");
            for(int j =0; j<Nlado-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
    } 
        //
        for(int i = 0; i<Nlado;i++){
            System.out.print("*");
        }
    }
    
}
