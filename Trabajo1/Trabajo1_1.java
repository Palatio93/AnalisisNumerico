import java.util.Scanner;

public class Trabajo1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tBienvenido a este programa");
        System.out.println("Del siguiente menu, por favor selecciona el numero del metodo que quieres elegir");

        System.out.println("\t1) Metodo de Biseccion");
        System.out.println("\t2) Metodo de Falsa Posicion");
        System.out.println("\t3) Metodo de Newton Raphson");

        System.out.print("Ingresa tu seleccion aqui -> ");
        int decision = checaInt(sc);

        switch (decision) {
            case 1:
                biseccion();
                break;
            case 2:
                falsa_posicion();
                break;
            case 3:
                newton_raphson();
                break;
            default:
                System.out.println("Seleccion invalida");
                break;
        }

        sc.close();
    }

    public static void biseccion() {
        System.out.println("Entra a la resolucion con el metodo de biseccion");
    }

    public static void falsa_posicion() {
        System.out.println("Entra a la resolucion con el metodo de falsa posicion");
    }

    public static void newton_raphson() {
        System.out.println("Entra a la resolucion con el metodo de newton raphson");
    }

    public static int checaInt(Scanner sc) {
        int provi = 0;
        while (true) {
            try {
                provi = Integer.parseInt(sc.nextLine());
                if (provi > 0 && provi < 4)
                    return provi;
                else {
                    System.out.println("Tu seleccion no es valida");
                    System.out.print("Ingresa una opcion valida");
                }
                    
            } catch (NumberFormatException e) {
                System.out.println("No fue ingresado un numero entero");
                System.out.print("Ingresa un numero valido: ");
            }
        }

    }
}
