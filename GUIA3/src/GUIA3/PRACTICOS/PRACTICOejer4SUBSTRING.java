/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 *
 * @author Usuario
 */
public class PRACTICOejer4SUBSTRING {
    public static void main(String[] args) {
        String frase=null;
        
      
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa una frase que tenga la primera letra una A");
        frase=leer.nextLine();
       
            if (frase.substring(0, 1).equalsIgnoreCase("A")) {System.out.println("correcto");
            
        }else System.out.println("incorrecto");
        }
            
        }
            
        
           
       
        
        
    
    

