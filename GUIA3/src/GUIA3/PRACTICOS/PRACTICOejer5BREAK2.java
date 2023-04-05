/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/***Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 *
 * @author Usuario
 */
public class PRACTICOejer5BREAK2 {
    public static void main(String[] args) {
        int Vlimite,num,suma;
        suma=0;
        num=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese primero un valor limite");
        Vlimite=leer.nextInt();
        System.out.println("ahora ingrese numero que se sumara hasta llegar al valor limite que ingreso con anterioridad");
        for (int i = 0; i <= Vlimite; i++) {num=leer.nextInt();
        suma=suma+num;
            if (suma>Vlimite) {break;
                
            }
            
        }
            
        System.out.println(suma);
    }
    
}
