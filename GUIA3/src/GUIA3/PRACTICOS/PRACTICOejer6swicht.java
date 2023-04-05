/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 *
 *
 * @author Usuario
 */
public class PRACTICOejer6swicht {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, opcion, resultado,salida=0,n=0,adios=0;
        String resp = null;
        
        String sal=null,  res=null;
        
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero ");
        num2 = leer.nextInt();
        sal=String.valueOf(salida);

        do{
           
        System.out.println("MENU\r \n1 SUMA \n1 RESTA \n3 MULTIPLICAR \n4 DIVIDIR \n5 salir  \n6  A \r ELEGIR OPCION");
        opcion = leer.nextInt();
        switch (opcion) {//opcion es un int
            case 1:
                resultado = num1 + num2;
                System.out.println("tu resultado es" + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("tu resultado de la resta es " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("el resultado de tu multiplicacion es " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("tu resultado de la div es " + resultado);
                break;
            case 5:
                
                System.out.println("Esta seguro que desea salir?(S/N)");
                 res=leer.next();
                if (res.equalsIgnoreCase("S")) {
                    adios=1 ;break;
                    
                }
               
              
              

        }
    }while(adios!=1) ; 
    }

}
