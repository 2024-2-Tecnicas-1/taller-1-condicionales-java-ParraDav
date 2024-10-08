package ejercicios;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {

    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
        int[] numeros = {numero1, numero2, numero3, numero4};
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {
                int a = numeros[j];
                int s = numeros[j + 1];
                if (a > s) {
                    numeros[j] = s;
                    numeros[j + 1] = a;

                }
            }
        }
        StringBuilder k = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            k.append(numeros[i]);
            if (i < numeros.length - 1) {
                k.append(" ");
            }

        }
        return k.toString();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();

        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
