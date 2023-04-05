/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PRACTICOSextras1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[][] matriz = new double[10][5];
        // rellenar con notas
        System.out.println("ingrese la notas de los alumnos");
        for (int i = 0; i < matriz.length; i++) {  //deje la fila i=2 para el promedio
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = leer.nextDouble();
            }
        }
       // PromedioNotas(matriz);
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                matriz[i][4] = (matriz[i][0] * 0.10) + (matriz[i][1] * 0.15) + (matriz[i][2] * 0.25) + (matriz[i][3] * 0.25);

            }

        }
        System.out.println("mira esta matriz es el promedio"+matriz[0][4]);
        System.out.println("hola");
        //para blodiar nomas
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println(" ");
        }

    }

    /*private static void PromedioNotas(double[][] matriz) {
        double promedio = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][4] = (matriz[i][0] * 0.10) + (matriz[i][1] * 0.15) + (matriz[i][2] * 0.25) + (matriz[i][3] * 0.25);

            }

        }

        
    }
*/
}
