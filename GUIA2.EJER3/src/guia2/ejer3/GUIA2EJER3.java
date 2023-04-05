/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ejer3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA2EJER3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrerse una frase que luego se pondra en mayuscula y luego en minuscula");
        Scanner leer=new Scanner(System.in);
        String Frase;
        Frase=leer.next();
        
        System.out.println("en mayusculas"+Frase.toUpperCase()+"en minusculas"+Frase.toLowerCase());
    }
    
}
