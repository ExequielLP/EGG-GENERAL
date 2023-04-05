/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4TEORICO;

import java.util.Scanner;

/**Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
 * (incluyendo a las vocales acentuadas) 
 * se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 *
 * @author Usuario
 */
public class GUIA4teorico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 
       String frase = leer.nextLine();
        transformar(frase);

    }

    public static void transformar(String frase) {
       
        for (int i = 0; i < frase.length(); i++) {

            switch (frase.charAt(i)) {
                case 'a':
                    System.out.print("@");
                    break;
                case 'e':
                    System.out.print("#");
                    break;
                case 'i':
                    System.out.print("$");
                    break;
                case 'o':
                    System.out.print("%");
                    break;
                case 'u':
                    System.out.print("*");
                    break;
                default : 
                    System.out.print(frase.charAt(i));break;
                            
            }
        }

    }

}
