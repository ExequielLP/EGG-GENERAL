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
public class YOUTUBE2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double[][] matriz=new double[4][4];
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <3; j++) {
                matriz[i][j]=leer.nextInt();
                matriz[i][3]=(matriz[i][0]+matriz[i][1]+matriz[i][2])/3;
            }
            
        }
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.print(" "+matriz[i][j]);
                
            }
            System.out.println("  ");
        }
            
        
        
        
        
        
        
    }
    
}
