/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 *
 * @author egar0
 */
public class Guia6Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,res,opc;
        String respuesta;
        Scanner leer = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("*****************MENU*********************");
        System.out.println("***1 : SUMAR******************************");
        System.out.println("***2 : RESTAR*****************************");
        System.out.println("***3 : MULTIPLICAR************************");
        System.out.println("***4 : DIVIDIR****************************");
        System.out.println("***5 : SALIR******************************");
        System.out.println("ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=leer.nextInt();
        respuesta = "";
        do {
            System.out.println("Seleciones la opcion para realizar una operacion");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    res = num1+num2;
                    System.out.println("La suma de los numeros es: " +res);
                    break;
                case 2:
                    res = num1-num2;
                    System.out.println("La resta de los numeros es: " +res);
                    break;
                    
                case 3:
                    res = num1*num2;
                    System.out.println("La multiplicacion de los numeros es: "+res);
                    break;
                case 4:
                    res = num1/num2;
                    System.out.println("La división de los numeros es: "+res);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = leer.next();
                    if(respuesta.equals("n")){
                       
                    }else{
                        break;
                    }            
            }
        }while(opc == 5 && respuesta.equals("n")); 
    }
    
}
