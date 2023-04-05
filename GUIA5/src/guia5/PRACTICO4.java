/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICO4 {
    public static void main(String[] args) {
        
        int [][]matriz=new int[4][4];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                
            }
            
        }
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0;j<matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
       
        System.out.println(" ");
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0;j<matriz.length; j++) {
                System.out.print("["+matriz[j][i]+"]");
            }
            System.out.println(" ");
        }
        
    }
}
