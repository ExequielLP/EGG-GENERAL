/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer.de.youtube;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERDEYOUTUBE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena1,cadena2,mensaje;
        Scanner leer=new Scanner(System.in);
       int opcion;
        System.out.println("ingrese una frase1");
        cadena1=leer.next();
        System.out.println("ingrese otra fase2");
        cadena2=leer.next();
        System.out.println("ingrese la opcion que quiera Menu\n1 comprar \n2 Mayusculas \n3 Minusculas \n4 Tamaño");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:System.out.println(cadena1.equals(cadena2));break;
            case 2: System.out.println("queda en matusculas asi"+cadena1.toUpperCase()+"\t"+cadena2.toUpperCase() );break;
            case 3: System.out.println("queda en minusculas asi"+cadena1.toLowerCase()+cadena2.toLowerCase());break;
            case 4:System.out.println("el tamaño de la frase 1 es\t"+cadena1.length()+"\tel tamaño de la frase 2 es\t"+cadena2.length());break;
            default : System.out.println("que toccaste?");
        }
       
        
    }
    
}
