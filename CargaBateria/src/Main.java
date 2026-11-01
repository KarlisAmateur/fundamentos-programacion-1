import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char opc;

        do {
            System.out.println("-SIMULADOR DE CARGA DE BATERÍA-");
            System.out.print("Introduzca el porcentaje inicial de batería (0-100): ");
            int porcentajeInicial = teclado.nextInt();

            while (porcentajeInicial < 0 || porcentajeInicial > 100) {
                System.out.println("El porcentaje inicial debe estar entre 0 y 100.");
                System.out.print("Introduzca el porcentaje inicial de batería (0-100): ");
                porcentajeInicial = teclado.nextInt();
            }
            int minutosNecesarios = calcularMinutos(porcentajeInicial);

            if (minutosNecesarios == 0)
                System.out.println("La batería ya está al 100%, no necesita ningún minuto de carga.");
            else
                System.out.println("La batería tardará " + minutosNecesarios + " minuto(s) en completarse al 100%.");

            System.out.print("¿Quiere realizar otra simulación? (s/n): ");
            opc = teclado.next().charAt(0);
        } while (opc == 's' || opc == 'S');
    }

    static int calcularMinutos(int porcentajeI) {
        final int CARGA_MIN = 8;
        if (porcentajeI == 100) {
            return 0;
        }
        int minutos = 0;
        while (porcentajeI < 100) {
            porcentajeI += CARGA_MIN;
            minutos++;
        }
        return minutos;
    }
}