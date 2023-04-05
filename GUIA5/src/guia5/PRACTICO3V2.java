/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author Usuario
 */
public class PRACTICO3V2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = 0, contador = 0, contadorDigitos = 0,Contador1=0,Contador2=0,Contador3=0,Contador4=0,Contador5=0;
        System.out.println("ingrese la dimension del vector");
        int[] vector = new int[leer.nextInt()];
        //for para llenar numeros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        //for para ver vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");

        }
        //recorrer para verificar digitos
        for (int i = 0; i < vector.length; i++) {
            
            ContarDigitos(vector[i]);
            
        }
        
        for (int i = 0; i <vector.length;i++) {
            
        
        if (ContarDigitos(vector[i])==1) {System.out.println(Contador1=Contador1+1);
            
        }else if (ContarDigitos(vector[i])==2) {Contador2=Contador2+1;
            
        }else if (ContarDigitos(vector[i])==3) {Contador3=Contador3+1;
            
        }else if (ContarDigitos(vector[i])==4) {Contador4=Contador4+1;
            
        }else if (ContarDigitos(vector[i])==5) {Contador5=Contador5+1;
            
        }
        
        }
        System.out.println("\n1) la cantidad numeros de 1 digito "+Contador1+"\n2) la cantidad numeros de 2 digitos "+Contador2+"\n3) la cantidad  numeros de 3 digitos "+Contador3+"\n4) la cantidad  numeros de 4 digitos "+Contador4+"\n5) la cantidad  numeros de 5 digitos "+Contador5);
    }
//funcion para contador de digitos
    public static int ContarDigitos(int num) {
       
        
        int contador=0;
        do {
            
            num=num / 10;
            contador=contador+1;
            
        } while (num > 0);
        
        return contador;
    }

}
