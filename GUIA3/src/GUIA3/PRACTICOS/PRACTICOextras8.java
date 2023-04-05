/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,.
 * 
 * la cantidad de números pares y la cantidad de números impares. 
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 *
 * @author Usuario
 */
public class PRACTICOextras8 {
    public static void main(String[] args) {
        int num=0,salida=0,par=0,imp=0;
        System.out.println("ingrese numeros enteros");
        Scanner leer=new Scanner(System.in);
       do{
        num=leer.nextInt();
        if (num%5==0) {
            salida=3;
            break;
        }
        else if (num%2==0){
            par+=1;
        }else imp+=1;    
       }while(salida!=3);     
            
        System.out.println("cantidad de numeros leido "+(par+imp)+" cantidad de numeros pares "+par+" cantidad de numeros imparares "+imp);
    
       
    }
    
}
