/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.

 *
 * @author Usuario
 */
public class PRACTICOextras4 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);
        do{
        System.out.println("ingresa un numero del 1 al 10");
        num=leer.nextInt();
              
       
            switch (num){
                case 1 : System.out.println("I");break;
                case 2: System.out.println("II");break;
                case 3: System.out.println("III");break;
                case 4: System.out.println("IV");break;
                case 5 : System.out.println("V");break;
                case 6 : System.out.println("VI");break;
                case 7 : System.out.println("VII");break;
                case 8 : System.out.println("IIV");break;
                case 9 : System.out.println("IV");break;
                case 10 : System.out.println("V");break;
                }
        
        }while(num>0 && num<11);
                
            
         
    }
    
}
