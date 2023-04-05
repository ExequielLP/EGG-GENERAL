/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejer4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA2EJER4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C,F;
        System.out.println("ingrese cantidad de grados C y le diremos con F son");
        Scanner leer=new Scanner (System.in);
        C=leer.nextInt();
        F=32+(9*C/5);
        System.out.println("la cantidad de grados C "+C+"\t es de F"+F);
    }
    
}
