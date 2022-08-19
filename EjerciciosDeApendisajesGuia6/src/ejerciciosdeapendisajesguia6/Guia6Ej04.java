/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 *
 * @author egar0
 */
public class Guia6Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double C,F;
       Scanner equivalente = new Scanner(System.in);
        System.out.println("ingrese cantidad de grados centigrados"); 
        C = equivalente.nextDouble();
        F = 32+(9*C/5);
        System.out.println("el equivalente en grados Fahrenheit es: " +F);
    }
    
}
