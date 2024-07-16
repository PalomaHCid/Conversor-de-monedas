//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de monedas");
        System.out.println("¿Dólares o Pesos?");
        System.out.println("1. Dólares");
        System.out.println("2. Otra moneda");
        int opcion1 = scanner.nextInt();

        if (opcion1 == 1) {
            System.out.println("****** MENU ******");
            System.out.println("1. USD a MXN");
            System.out.println("2. USD a ARS");
            System.out.println("3. USD a COP");
            System.out.println("4. USD a EUR");
            int opcion2 = scanner.nextInt();
            realizarConversion(opcion1, opcion2);
        } else if (opcion1 == 2) {
            System.out.println("****** MENU ******");
            System.out.println("1. ARS a USD");
            System.out.println("2. MXN a USD");
            System.out.println("3. COP a USD");
            System.out.println("4. EUR a USD");
            int opcion2 = scanner.nextInt();
            realizarConversion(opcion1, opcion2);
        } else {
            System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void realizarConversion(int opcion1, int opcion2) {
        Scanner scanner = new Scanner(System.in);
        double cantidad;

        System.out.print("Ingrese la cantidad a convertir: ");
        cantidad = scanner.nextDouble();

        switch (opcion1) {
            case 1: // Dólares
                switch (opcion2) {
                    case 1: // USD a MXN
                        System.out.println(cantidad + " USD equivalen a " + (cantidad * 20.00) + " MXN");
                        break;
                    case 2: // USD a ARS
                        System.out.println(cantidad + " USD equivalen a " + (cantidad * 98.78) + " ARS");
                        break;
                    case 3: // USD a COP
                        System.out.println(cantidad + " USD equivalen a " + (cantidad * 3843.00) + " COP");
                        break;
                    case 4: // USD a EUR
                        System.out.println(cantidad + " USD equivalen a " + (cantidad * 0.85) + " EUR");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            case 2: // Otra moneda a USD
                switch (opcion2) {
                    case 1: // ARS a USD
                        System.out.println(cantidad + " ARS equivalen a " + (cantidad * 0.010) + " USD");
                        break;
                    case 2: // MXN a USD
                        System.out.println(cantidad + " MXN equivalen a " + (cantidad * 0.050) + " USD");
                        break;
                    case 3: // COP a USD
                        System.out.println(cantidad + " COP equivalen a " + (cantidad * 0.00026) + " USD");
                        break;
                    case 4: // EUR a USD
                        System.out.println(cantidad + " EUR equivalen a " + (cantidad * 1.18) + " USD");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }
}
