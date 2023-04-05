/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4.PRACTICOS;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 * @author Usuario
 */
public class PRACTICO3 {

    public static void main(String[] args) {
        double euro; 
        String dolar;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euro a comvertir a dolar");
        Converit(leer.nextDouble(), "dolar");
    }

    public static void Converit(double euro, String dolar) {
        double dolarr=euro*1.28611;
        System.out.println("el cambio de "+euro+" son "+dolarr+" dolares");
    }

}
