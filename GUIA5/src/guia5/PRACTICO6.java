/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 *
 * @author Usuario
 */
public class PRACTICO6 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        //rellenar matriz con nuermos por teclado   
        boolean magico = false;

        // COMPROBAR NUMEROS INGRERSADOS Y RELLENAR LA MATRIZ!!  
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("ingrese 9 numeros entre el 1 y el 9 ");
                do {

                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] > 9 || matriz[i][j] < 1) {
                        System.out.println("te dije que tienen que ser entre 1 y 9");
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }
        }
        // ACA SOLO MOSTRAMOS LA MATRIZ 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        /// termina

        System.out.println("RESULTADOS");
        FuncionPositiva(matriz);
        System.out.println("el resultado de la funcion diagonal es" + FuncionPositiva(matriz));

        FuncionNegativa(matriz);
        System.out.println("el resultado de la funcion negativa es " + FuncionNegativa(matriz));

        
        

        
        int resDP = FuncionPositiva(matriz), resDN = FuncionNegativa(matriz), sumaF = FuncionSumaFila(matriz), sumaM = FuncionSumaColumna(matriz);

        if (resDP == resDN && resDN == sumaF && sumaF == sumaM) {
            magico = true;
        }
        System.out.println("tu cuadrado es magico?" + magico);
        
        ;

    }
    //FUNCION DIAGONAL POSITIVA 

    public static int FuncionPositiva(int[][] matriz) {
        int sumaDP = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++, i++) {

                sumaDP = sumaDP + matriz[i][j];

            }
        }

        return sumaDP;
    }

    //FUNCION DIAGONAL NEGATIVA
    public static int FuncionNegativa(int[][] matriz) {
        int sumaDN = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 2; j >= 0; j--, i++) {   // si porque que sea j=2 , j==0 NO ME LEE LA MATRIZ LPM PORQUE , PERO SI PONGO >= SI
                sumaDN = sumaDN + matriz[i][j];

            }
        }
        return sumaDN;
    }

    //FUNCION SUMA FILA
    public static int FuncionSumaFila(int[][] matriz) {
        int sumaFila = 0, contadorRonda = 0, sumaFfinal1 = 0, sumaFfinal2 = 0, sumaFfinal3 = 0, sumaCompletaF = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaFila = sumaFila + matriz[i][j];
                contadorRonda = contadorRonda + 1;
                
                if (contadorRonda == 3) {
                    sumaFfinal1 = sumaFila;
                } else if (contadorRonda == 6) {
                    sumaFfinal2 = sumaFila;

                } else if (contadorRonda == 9) {
                    sumaFfinal3 = sumaFila;

                }
                if (sumaFfinal1 == sumaFfinal2 && sumaFfinal2 == sumaFfinal3) {
                    sumaCompletaF = sumaFfinal1;

                }

            }
            sumaFila = 0;
        }
        System.out.println("el resultado de la fila i1 es " +sumaFfinal1);
        System.out.println("el resultado de la fila i2 es "+sumaFfinal2);
        System.out.println("el resultado de la fila i3 es "+sumaFfinal3);
        return sumaCompletaF;
    }

    //FUNCION SUMA COLUMNA
    public static int FuncionSumaColumna(int[][] matriz) {
        int sumaColumna = 0, contadorRonda = 0, sumaFfinal1 = 0, sumaFfinal2 = 0, sumaFfinal3 = 0, sumaCompletaC = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna = sumaColumna + matriz[j][i];
                contadorRonda = contadorRonda + 1;
                if (contadorRonda == 3) {
                    sumaFfinal1 = sumaColumna;
                } else if (contadorRonda == 6) {
                    sumaFfinal2 = sumaColumna;

                } else if (contadorRonda == 9) {
                    sumaFfinal3 = sumaColumna;

                }
                if (sumaFfinal1 == sumaFfinal2 && sumaFfinal2 == sumaFfinal3) {
                    sumaCompletaC = sumaFfinal1;

                }

            }
            sumaColumna = 0;

        }
        System.out.println("el resultado de la fila J1 es " +sumaFfinal1);
        System.out.println("el resultado de la fila J2 es "+sumaFfinal2);
        System.out.println("el resultado de la fila J3 es "+sumaFfinal3);

        return sumaCompletaC;
    }
}

