/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 *
 * @author Usuario
 */
public class PRACTICOextras6 {
    public static void main(String[] args) {
    double altura,promedio=0,promedioB=0,alturaB=0,contadorB=0,alturaA=0,contadorA=0;
    
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la altura de 6 personas");
        do{
        altura=leer.nextDouble();
        if (altura<1.60) {
            alturaB=alturaB+altura;
            contadorB=contadorB+1;
                       
        }
        else {alturaA=alturaA+altura;}
            
             
            
            
        
        
        
   
        }while((contadorA+contadorB)<6);
        
        promedioB=alturaB/contadorB;
        promedio=(alturaA+alturaB)/6;
        System.out.println("promedio de persona por debajo de 1,6o es\t"+promedioB+"\t promedio de altura general es de 1.60 es "+promedio);
        
    }
    
}
