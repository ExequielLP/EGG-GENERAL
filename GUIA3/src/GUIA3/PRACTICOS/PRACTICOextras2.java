/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

/**Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
 * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 *
 * @author Usuario
 */
public class PRACTICOextras2 {
    public static void main(String[] args) {
        int A=2,B=3,C=4,D=5,AUX=0;
        AUX=B;
        B=C;System.out.println("B"+B);
        C=A;System.out.println("C"+C);
        A=D;System.out.println("A"+A);
        D=AUX;System.out.println("D"+D);
       
        
    }
    
}
