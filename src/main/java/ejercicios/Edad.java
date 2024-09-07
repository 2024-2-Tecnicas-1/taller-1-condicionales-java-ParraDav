
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Edad
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = LocalDate.of(anno, mes, dia);
        Period dif = Period.between(nacimiento, hoy);
        int edad = dif.getYears();
        return"Usted tiene " + edad + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
