/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4TEORICO;

import java.util.Scanner;

/**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
 * validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

 *
 * @author Usuario
 */
public class GUIA4teorico2 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
int num1,num2;
        EsMultiplo(leer.nextInt(),leer.nextInt());



    }
    
    public static void EsMultiplo(int num1,int num2){
        if (num1%num2==0) {System.out.println("son multiplos");
            
        }else System.out.println("no son multiplos");
    
    }
}
