/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAA3.TEORICA.EJERCIOS;

import java.util.Scanner;

/**
 * Ejercicio 8 Escriba un programa que valide si una nota está entre 0 y 10,
 * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea
 * correcta.
 *
 * @author Usuario
 */
public class teorico {

    public static void main(String[] args) {
       int num;
       Scanner leer=new Scanner(System.in);
        System.out.println("por favor ingresa un numero del 0 al 10");
        num=leer.nextInt();
     
       while(num<0 || num>10){
           System.out.println("ingresa otra vez un numero del 0 al  10");
           num=leer.nextInt();
       }
       
            
            
            
        }
     
      
    }


