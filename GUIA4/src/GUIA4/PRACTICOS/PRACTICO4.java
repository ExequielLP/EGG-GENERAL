/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4.PRACTICOS;

import java.util.Scanner;

/**Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 * 2, 3, 5, 7, 11
 *
 */
public class PRACTICO4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para saber si es primo");
        boolean resultado = Primo(leer.nextInt());

        System.out.println(resultado);
    }

    public static boolean Primo(int num) {
        int contador = 0;

        boolean resultado=false;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0 ) {
                contador = contador + 1;
            }
            if (contador==2) {resultado=true;
                
            }else resultado=false;

        }

        return resultado;

    }
}
