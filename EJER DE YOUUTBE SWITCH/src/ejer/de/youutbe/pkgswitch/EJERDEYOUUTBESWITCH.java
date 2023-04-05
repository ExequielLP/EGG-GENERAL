/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer.de.youutbe.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EJERDEYOUUTBESWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,opcion;
        String msj=null;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese numero 1 ");
        num1=leer.nextInt();
        System.out.println("ingrese numero 2");
        num2=leer.nextInt();
        System.out.println("menu \n1 Suma \n2 Resta \n3 Multiplicacion \n4 division ");
        opcion=leer.nextInt();
        
        switch(opcion){
            case 1 : msj="la suma de los dos numeros da como resultado\t"+(num1+num2);break;
            case 2: System.out.println("la resta de los numeros es\t"+(num1-num2));break;
            case 3: System.out.println("la multiplicacion de los dos numeros es\t"+(num1*num2));break;
            case 4:System.out.println("la division de los dos numeros es de\t"+(num1/num2));break;
            default: System.out.println("dale capo, del 1 al 4");break;
        }
        System.out.println(msj);
    }
    
}
