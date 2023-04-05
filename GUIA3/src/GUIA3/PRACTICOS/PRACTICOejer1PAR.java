/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar.

 * @author Usuario
 */
public class PRACTICOejer1PAR {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero y te digo si es par o impar");
        num=leer.nextInt();
        if (num%2==0) {System.out.println("es par");}
        else System.out.println("es impar");
            
        
    }
}
