/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3.PRACTICOS;

import java.util.Scanner;

/**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
* Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 *
 * @author Usuario
 */
public class PRACTICOejer7 {
    public static void main(String[] args) {
        System.out.println("bienvenido al RS232, recorda que los codigos solo seras validos si comienza con X y terminan con O, maximo 5 caracteres");
        Scanner leer=new Scanner(System.in);
        String cadena=null;
        int cadenaV=0,cadenaF=0;
        do{
            cadena=leer.next();
            if (cadena.length()==5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(4, 5).equalsIgnoreCase("O") ) {
                cadenaV=cadenaV+1;
                
            }else if (cadena.equalsIgnoreCase("&&&&&")){
               cadena="&&&&&"; //tambien un break ; y fue
            }
            else cadenaF=cadenaF+1;
            
        }while(cadena!="&&&&&"); 
        System.out.println("cantidad de cadena correctas\t"+cadenaV+"\tcantidad de cadenas incorrectas\t"+cadenaF);
    }
    
}
