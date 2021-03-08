import java.util.Scanner;
import java.lang.Math;

/**
 * Calculadora de raíces, tanto reales como complejas.
 */

public class Trabajo1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tBienvenido");
        System.out.println("\nEste programa calcula las raices de una ecuacion del tipo ax^2 + bx + c = 0");

        System.out.print("Por favor ingresa el coeficiente a -> ");
        int a = checaInt(sc);

        System.out.print("Por favor ingresa el coeficiente b -> ");
        int b = checaInt(sc);

        System.out.print("Por favor ingresa el coeficiente c -> ");
        int c = checaInt(sc);

        double discriminante = Math.pow(b,2) - (4*a*c);

        boolean complejo = false;

        if (discriminante < 0) {
            discriminante *= -1;
            complejo = true;
        }

        if (!complejo) {
            double raiz_1 = (-1*b + Math.sqrt(discriminante)) / (2*a);
            double raiz_2 = (-1*b - Math.sqrt(discriminante)) / (2*a);
            System.out.printf("Las raices son:\n\tx1 = %.0f\n\tx2 = %.0f\n", raiz_1, raiz_2);
        } else {
            double raiz_real = (-1*b) / (2*a);
            double raiz_im = Math.sqrt(discriminante) / (2*a);
            System.out.printf("Las raices son:\n\tx1 = %.0f + %.0fi\n\tx2 = %.0f - %.0fi\n", raiz_real, raiz_im, raiz_real, raiz_im);
        }

        sc.close();
    }


    public static int checaInt(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No fue ingresado un numero entero");
                System.out.print("Ingresa un numero valido: ");
            }
        }

    }
}
