/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 *
 *
 */
public class PRACTICOejer8 {
    public static void main(String[] args) {
        int num=0;
        System.out.println("ingrese un numero de elementos para su cuadraro");
        Scanner leer=new Scanner(System.in);
        num=leer.nextInt();
        
        
        for (int i = 0; i < num; i++) {
            
                 for (int j = 0; j < num; j++) {
                 if (i==0 || i==num-1 || j==0 || j==num-1 ){ 
                 {System.out.print(" *");}
                     
                 } else {
                 System.out.print("  "); }
            }
               System.out.println(""); 
        }
            
            
        }
        
            
        
    }  
   
    

/*si i>1 y i<num y j>1 y j<num
			escribir sin saltar "   "
		sino 
			escribir sin saltar "*  "

*/