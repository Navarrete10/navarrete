//ACTIVIDAD 9: OBTENER EL NUMERO MAYOR Y MENOR DE 30 NUMEROS
//YEREMI NAVARRETE HERRERA
package mayor.menor;
import java.util.Scanner;


 
public class MayorMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 30;

        System.out.println("Ingrese " + totalNumeros + " numeros:");

        double mayor = Float.MIN_VALUE, menor = Float.MAX_VALUE;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Numero " + i + ": ");
            float numeroActual = scanner.nextFloat();

            mayor = Math.max(mayor, numeroActual);
            menor = Math.min(menor, numeroActual);
        }

        
        System.out.println("El numero menor es: " + (int)menor);
        System.out.println("El numero mayor es: " + (int)mayor);

        scanner.close();
    }
}