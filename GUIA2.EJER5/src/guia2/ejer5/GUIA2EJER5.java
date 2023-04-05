/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejer5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA2EJER5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,numD,numT;
        double numR;
       
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa un numero entero y te mostrare el doble, el triple y su raiz");
        num=leer.nextInt();
        numD=num*2;
        numT=num*3;
        numR=Math.sqrt(num);
        System.out.println("el doble de tu numero es \t"+numD);
        System.out.println("tu numero triple es\t"+numT);
        System.out.println("la raiz de tu numero es\t" +numR);
    }
    
}
