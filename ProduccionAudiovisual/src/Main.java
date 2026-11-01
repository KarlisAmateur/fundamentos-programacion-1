import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-RENTA DE CÁMARAS-");

        System.out.print("Introduzca la tarifa de alquiler por hora: ");
        double tarifaAlquiler = teclado.nextDouble();
        while (tarifaAlquiler <= 0) {
            System.out.println("La tarifa debe ser mayor que cero.");
            System.out.print("Introduzca la tarifa de alquiler por hora: ");
            tarifaAlquiler = teclado.nextDouble();
        }
        System.out.print("Introduzca la cantidad de horas de uso: ");
        double cantHoras = teclado.nextDouble();
        while (cantHoras <= 0) {
            System.out.println("Las horas deben ser mayores que cero.");
            System.out.print("Introduzca la cantidad de horas de uso: ");
            cantHoras = teclado.nextDouble();
        }
        double totalPagar = calcularRenta(tarifaAlquiler, cantHoras);
        mostrarComprobante(totalPagar);
    }

    static double calcularRenta(double tarifaA, double horas) {
        double total = tarifaA * horas;
        return total;
    }
    static void mostrarComprobante(double total) {
        System.out.println("-COMPROBANTE DE RENTA-");
        System.out.println("Costo total: $" + total);
    }
}