/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4.PRACTICOS;

import java.util.Scanner;

/**Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
 * La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 

 *
 * @author Usuario
 */
public class PRACTICO1 {
    public static void main(String[] args) {
        int resultado=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros y seleccione una opcion \r \n1 suma \n2 restar \n3 multiplicar \n4 dividir");
    int opcion=leer.nextInt();
    switch(opcion){
        case 1:
            System.out.println("ingrese dos numeros");
            suma(leer.nextInt(), leer.nextInt());
            System.out.print(" tu resultado de la suma es "+resultado);
        break;
            
        case 2:
            System.out.println("ingrese dos numeros");
            resultado=resta(leer.nextInt(), leer.nextInt());
            System.out.println("tu resultado es " +resultado);
            break;
        case 3 :
            System.out.println("ingrese dos numeros");
            int num1=leer.nextInt();
            int num2=leer.nextInt();
            resultado=multiplicacion(num1,num2);
                   System.out.println("el  resultado de tu multiplicacion es "+resultado);
        case 4:
            System.out.println("ingresa dos numeros");
            resultado=division(leer.nextInt(), leer.nextInt());
            System.out.println("el resultado de la division es"+resultado);
            
        
    }    
    }
    public static int suma(int num1,int num2){
    int resultado=num1+num2;
    
        System.out.println("su resultado es "+resultado);
    return resultado;
    }
    public static int resta(int num1,int num2){
int resultado=num1-num2;
return resultado;

}
    public static int multiplicacion(int num1,int num2){
    int resultado=num1*num2;
    return resultado;
}
    public static int division(int num1,int num2){
    int resultado=num1/num2;
    return resultado;
    }
    
    
}