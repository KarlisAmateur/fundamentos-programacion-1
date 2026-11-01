import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-ESTIMADOR DE TIEMPO DE DESCARGA-");

        System.out.print("Introduzca el tamaño del archivo en MB: ");
        double tamanoArchivo = teclado.nextDouble();
        while (tamanoArchivo < 0){
            System.out.println("El tamaño del archivo no puede ser menor a 0");
            System.out.print("Introduzca el tamaño del archivo en MB: ");
            tamanoArchivo = teclado.nextDouble();
        }
        System.out.print("Introduzca la velocidad de descarga en MB/s: ");
        double velocidadDescarga = teclado.nextDouble();
        while (velocidadDescarga<= 0){
            System.out.println("La velocidad de descarga debe ser mayor a cero.");
            System.out.print("Introduzca la velocidad de descarga en MB/s: ");
            velocidadDescarga = teclado.nextDouble();
        }

            double tiempoDescarga = calcularTiempo(tamanoArchivo, velocidadDescarga);
            System.out.println("Tiempo estimado de descarga: " + tiempoDescarga + " segundos.");
    }
    static double calcularTiempo(double tamanoA, double velocidadD) {
        double tiempo = tamanoA / velocidadD;
        return tiempo;
    }
}