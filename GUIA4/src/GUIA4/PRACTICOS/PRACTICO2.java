/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4.PRACTICOS;

import java.util.Scanner;

/**Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 *
 * @author Usuario
 */
public class PRACTICO2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String res="";
        
       System.out.println("ingresa la cantdad de personas N");
         int n=leer.nextInt();
         for (int i = 0; i <n; i++) {
             System.out.println("ingreese nombre y edad");
             NombreyEdad(leer.next(), leer.nextInt());
             System.out.println("queres seguir preguntando");
             res=leer.next();
             if (res.equalsIgnoreCase("NO")){
             break;
             }
             
                 
                  
         }
       
         }
       
    
    
    public static void NombreyEdad(String nombre,int edad){
        if (edad<18) {
            System.out.println("tu nombre "+nombre+" tu edad es "+edad+" sos menor");
            }else System.out.println("tu nombre "+nombre+" tu edad es"+edad+"sos mayor");
        
        
        
    }
        
    }
    
        
             
         
   
         
       
    

