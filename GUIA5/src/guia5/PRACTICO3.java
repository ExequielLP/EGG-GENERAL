

package guia5;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 *
 * @author Usuario
 */
public class PRACTICO3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = 0, contador = 0;
        System.out.println("ingrese la dimension del vector");
        int[] vector = new int[leer.nextInt()];
        //for para llenar numeros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 1000);
        }
        //for para ver vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");

        }
        //recorrer para verificar digitos
        for (int i = 0; i < vector.length; i++) {
         
           contador=0;

            do {
                System.out.println("sada");
                if (resultado > 0) {

                    resultado =vector[i] / 10;
                    contador += 1;
                }

            } while (resultado > 0);

                switch(contador){
                    case 1 :System.out.println("tiene 1 digito");break;
                    case 2:System.out.println("tiene 2 digitos");break;
                    case 3:System.out.println("tiene 3 digitos");break;
                    case 4:System.out.println("tiene 4 digitos");break;
                    case 5:System.out.println("tiene 5 digitos");break;
                    default : System.out.println(" tiene mas digitos");
                
                }

            
        }

    }

}
