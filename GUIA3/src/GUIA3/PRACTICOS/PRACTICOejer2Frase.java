/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**
 *
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

 */
public class PRACTICOejer2Frase {
    public static void main(String[] args) {
        String frase=null;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase por favor, adivina...");
        frase=leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {System.out.println("CORRECTO JAJA");}
        else System.out.println("JAJA INCORRECTO");
        
    }
}
