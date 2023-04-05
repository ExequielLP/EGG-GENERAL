/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
 * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 *
 * @author Usuario
 */
public class PRACTICOextras7 {
    public static void main(String[] args) {
        double num,min=1000,max=-1000,fuera=0,num2=0;
        double promedio;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 5 numeros");
        while(fuera<5){
        
        num=leer.nextInt();
            if (num>max) {
                max=num;
                
                
            }else if (num<min) {
                min=num;
                
            }
          
            fuera=fuera+1;
        }
        System.out.println("numeor maximo es "+ max+" tu numero minimo es "+ min);
            
            
        
        
    }
    
}
