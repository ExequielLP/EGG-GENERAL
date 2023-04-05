/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAA3.TEORICA.EJERCIOS;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break.
 *
 *
 */
public class teoricoDoWhile {

    public static void main(String[] args) {
        int num,cont, suma;
       num=0;
       num=0;
       cont=0;
       suma=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 20 numeros");
       
        do {
           num = leer.nextInt();

            if (num == 0) {
                System.out.println("se capturo el numero 0 ");
                break;
            } else if (num < 0) {
                continue;
            }
            suma += num;
            cont++;
        
        } while (cont < 20);{
                System.out.println("la suma de los numeros es: " + suma);
    }
    
            
            
        
  
               
                    
        
                
    }
}
