/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeapendisajesguia6;

import java.util.Scanner;

/**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 *
 * @author egar0
 */
public class Guia6Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena, FDE;
        FDE = "&&&&&";
        int contcorrectas,contincorrectas,c;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese mensaje");
        contcorrectas = 0;
        contincorrectas = 0;
        
        do{
            cadena = leer.nextLine();
            c = cadena.length();
            if (c <=5 && c>=2){
                if (cadena.substring(0,1).equals("X") && cadena.substring(cadena.length()-1).equals("O")){
                    System.out.println("el mensaje es correcto");
                    contcorrectas++;
                } else if (cadena.equals(FDE)){
                    break;
                }
                else{
                   System.out.println("el mensaje es incorrecto");
                contincorrectas++; 
                }
            }else{
                System.out.println("el mensaje es muy largo");
                contincorrectas++;
            }
        }while(!cadena.equals(FDE));
     
        System.out.println("la cantidad de mensaje ingresado correctos es: "+contcorrectas);
        System.out.println("la cantidad de mensaje ingresado incorrectos es: "+contincorrectas);
    }
    
}
