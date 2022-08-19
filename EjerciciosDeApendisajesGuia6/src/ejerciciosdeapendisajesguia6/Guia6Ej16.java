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
public class Guia6Ej16 {

    /**Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero para buscar");
        n1 = leer.nextInt();
        n= 10;
        int vec[] = new int[n];
        for (int i = 0; i<vec.length-1;i++){
            vec[i] = (int) (Math.random()*n);
            System.out.print("["+vec[i]+"]");
        }
        for(int i = 0; i<vec.length-1;i++){
            if(n1 == vec[i]){
                System.out.println("El numero: "+n1+" se econtro en la posicion: "+i); 
            }
        }
    }
    
}
