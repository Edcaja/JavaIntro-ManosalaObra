/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 *
 * @author egar0
 */
public class Guia6Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double canteuro;
        String tipomoneda;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad en Euro para covertir"); 
        canteuro = leer.nextDouble();
        System.out.println("ingrese tipo de monedad");
        tipomoneda = leer.next();
         Convertir(canteuro,tipomoneda);
        //System.out.println("la cantidad: "+canteuro+"€ es "+Convertir);
        
                
    }
    public static void Convertir(double cant,String moneda){
        double d,y,l;
        if(moneda.equals("dolares")){
            d = cant*1.28611;
            System.out.println("la cantidad: "+cant+"€ es "+d+""+moneda);
        }else if (moneda.equals("yenes")){
            y = cant*129.852;
             System.out.println("la cantidad: "+cant+"€ es "+y+""+moneda);
        }else if(moneda.equals("libras")){
            l= cant*0.86;
          System.out.println("la cantidad: "+cant+"€ es "+l+""+moneda);  
        }
      
    }
    
}
