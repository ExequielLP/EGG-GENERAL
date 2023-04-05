/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAA3.TEORICA.EJERCIOS;

import java.util.Scanner;

/**
 *
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
 * e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
public class teoricoFor {

    public static void main(String[] args) {
        int num;
        

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 4 numeros del 1 al 20");
        
            

            for (int i = 0; i < 4; i++) {
                num = leer.nextInt();
                
                System.out.print(num);
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                   

                }
                System.out.println("");
                         
             
            }
    }    
    
    
}
