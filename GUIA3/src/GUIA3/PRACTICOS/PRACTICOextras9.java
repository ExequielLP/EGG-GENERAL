/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
 * realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 *
 * @author Usuario
 */
public class PRACTICOextras9 {

    public static void main(String[] args) {
        double num1, num2, num3 = 0, cociente = 0, residuo = 0;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros mayores que uno");
        num1= leer.nextInt();
        num2 = leer.nextInt();
        while (num1 > num2){
            num3=num1-num2;
            num1 = num3;
            residuo = num3;
            cociente = cociente + 1;}
        System.out.println("cociente es "+cociente+"residuo es "+residuo);

    }

}
