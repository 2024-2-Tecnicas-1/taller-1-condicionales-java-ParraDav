package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int A, int B) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis

        if (A >= 6 || B >= 6) {
            if ((A > 7 && B >= 6)||(B > 7 && A >= 6)) {
                return "Inválido";
            }
            if ((A == 7 && B < 5) || (B == 7 && A < 5)) {
                return "Inválido";
            }
            if ((A >= 6 && A <= 7) && A >= B + 2) {
                return "Ganó A";
            } else if ((B >= 6 && B <= 7) && B >= A + 2) {
                return "Ganó B";
            }
            if (A == 7 && B == 6) {
                return "Ganó A";
            } else if (B == 7 && A == 6) {
                return "Ganó B";
            }
            

        }
        return "Aún no termina";
        /*if ((A > B) && (A <= 7)) {
            return "Ganó A";
        }
        if (A == 7 && B < 5||B==7 &&A<5) {
            return "Inválido";
        }
        if ((7 > B + 2 || 7 > A + 2)) {
            return "Inválido";
        }

        if (B == 7 && A < 5) {
            return "Inválido";

        }
        if ((A > B && A != B + 2) || (B > A && B != A + 2) || (A == B)) {
            return "Aún no termina";
        }
        if (((A >= 5) && (B >= 5) && ((A < 7) && (B < 7))) || ((B >= 5) && (A >= 5) && ((B < 7) && (A < 7)))) {
            return "Aún no termina";
        }
        if ((B > A) && (B <= 7)) {
            return "Ganó B";
        } else {
            return "";
        }*/

    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int A = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int B = lector.nextInt();

        String respuesta = evaluar(A, B);
        System.out.println(respuesta);
    }
}
