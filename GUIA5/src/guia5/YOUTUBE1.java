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
public class YOUTUBE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador=0;
        int[]vector=new int[15];
        System.out.println("bue da mete 15 numeros y te digo cuantos 3 hay pa");
        for (int i = 0; i <vector.length; i++) {
            vector[i]=leer.nextInt();
            
        }
        
        for(int elemento:vector){
            if (elemento==3) { contador+=1;
                
            }
            
        
        }
        System.out.println("la cantidad de veces que aparece el numero 3 son :"+contador);

       

        }
    }
