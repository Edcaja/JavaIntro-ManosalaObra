/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author egar0
 */
public class Guia6Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,limite,sum;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para el limite"); 
        
        //cont = 0;
        sum= 0 ;  
        
        do{
           limite = leer.nextInt();
        }while(limite<0);
        System.out.println("ingrese numeros entero");
        while(sum <= limite){
            
            num = leer.nextInt();
            //cont= cont++;
            sum = sum +num;
            
        }
        System.out.println("La suma de los numero Ingreados es : "+ sum+ "supera el limite: "+limite);
    }
    
}
