/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejer2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA2EJER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese tu nombre por teclado");
       String nombre;
       Scanner leer=new Scanner(System.in);
       nombre=leer.next();
        System.out.println("tu nombre es\t "+nombre);
    }
    
}
