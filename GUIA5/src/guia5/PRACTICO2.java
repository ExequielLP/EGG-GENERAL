/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 *
 * @author Usuario
 */
public class PRACTICO2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int buscador,contador=0;
        System.out.println("ingrese tamaña de vector");
       int[]vector=new int[leer.nextInt()];
        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int)(Math.random()*5);
        }
        System.out.println("ingrese un numero a buscar y le diremossi esta repetido");
        buscador=leer.nextInt();
        for (int i = 0; i <vector.length; i++) {
            if (buscador==vector[i]) {System.out.println("tu numero se encuentra en la posicion"+i);
                contador+=1;
            }
            
        }
        System.out.println("la cantidad de veces que se encontro tu numero es de "+contador);
        for (int i = 0; i <vector.length; i++) {
            System.out.print(vector[i]);
            
        }
    }
    
}
