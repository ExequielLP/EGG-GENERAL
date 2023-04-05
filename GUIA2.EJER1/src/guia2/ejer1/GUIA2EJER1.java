/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejer1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA2EJER1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
     * El programa deberá después mostrar el resultado de la suma

     */
    public static void main(String[] args) {
       int num1,num2,suma;
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese num1  por teclado");
        
        num1=leer.nextInt();
        System.out.println("ingrese numero2 por teclado");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma de num1+num2=\t"+suma);
    }
    
}
