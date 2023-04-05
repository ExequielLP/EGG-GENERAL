/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 *
 * @author Usuario
 */
public class PRACTICOextras10 {
    public static void main(String[] args) {
        int num1,num2,num3=0,num4;
        Scanner leer=new Scanner(System.in);
        num1=(int) Math.random()*10;
        num2=(int)Math.random()*10;
        num3=num1*num2;
        System.out.println(num3);
        do{
        System.out.println("cual es el resultado de num1 * num2 ?");
        num4=leer.nextInt();
        }while(num4!=num3);
    }
    
}
