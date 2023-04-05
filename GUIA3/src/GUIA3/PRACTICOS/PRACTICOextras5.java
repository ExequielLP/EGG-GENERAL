/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**na obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
* y determine el importe en efectivo a pagar por dicho socio.

 *
 * @author Usuario
 */
public class PRACTICOextras5 {
    public static void main(String[] args) {
        String A,B,C,opcion;
        double precio;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("el  tratamiento cuesta $1000 \r ingrese una letra A,B o C de tipo de socio y le indicaremos que abonar \n1 socio tipo A \n2 socio tipo B \n3 socio tipo C" );
        opcion=leer.next();
        if (opcion.equalsIgnoreCase("A")|| opcion.equalsIgnoreCase("B")||opcion.equalsIgnoreCase("C") ) {
            
            
        
        System.out.println("indique el valor de dicho tratamiento");
        precio=leer.nextDouble();
        
        if (opcion.equalsIgnoreCase("A")) {
            
            precio=precio-(precio*0.5);
            System.out.println("tu estudio cuesta"+precio);
            
        }else if (opcion.equalsIgnoreCase("B")) {
            precio=precio-(precio*0.35);
            System.out.println("tu estudio cuesta"+precio);
            
        }else 
            System.out.println("tu estudio cuessta"+precio);
        
        }else 
            System.out.println("no pusiste bien la letra");
    }
    
}
