/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica . Se
 * dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 *
 *
 */
public class PRACTICO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizN = new int[4][4];
        //ARMO MATRIZ NORMAL
        System.out.println("matriz normal");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j]);

            }
            System.out.println(" ");

        }
        System.out.println("matriz 1  transpuesta");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = matriz[j][i];
                System.out.print(matriz1[i][j]);

            }
            System.out.println(" ");
        }
        //MATRIZ"N" NEGATIVA
        System.out.println("matriz transpuesta negativa");
        for (int i = 0; i < matrizN.length; i++) {
            for (int j = 0; j < matrizN.length; j++) {
                matrizN[i][j] =-1;
                System.out.print( matrizN[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("matriz 2 trnspuesta negativa");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = matriz1[i][j];
                matriz2[i][j] = matriz2[i][j] * matrizN[i][j];
                System.out.print(matriz2[i][j]);

            }
            System.out.println(" ");
        }
        
    }
}
