/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIAA3.TEORICA.EJERCIOS;

import java.util.Scanner;

/**
 *
 * Considera que estás desarrollando una web para una empresa que fabrica motores 
 * (suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
 * Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “La bomba es una bomba de pasta alimenticia”

 */
public class GUIA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tipoMotor;
       Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una opcion segun su motor \n1 tipo \n2 tipo2  \n3 tipo3 \n4 tipo4");
       tipoMotor=leer.nextInt();
       switch(tipoMotor){
           case 1: System.out.println("la boomba es de tipo agua");break;
           case 2: System.out.println("la bomba es de gasolina");break;
           case 3: System.out.println("la bomba es una de hormigon");break;
           case 4: System.out.println("la bomba es una bomba como la hermana de jose");break;
           default:System.out.println("valor no valido");
       }
   
      
        }
    }
    

