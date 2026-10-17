import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        final int CONSUMO_MINUTO=7;
        System.out.println("DRON PORCENTAJE DE BATERÍA");

        System.out.print("Introduzca la batería inicial (%): ");
        int pilaInicial = teclado.nextInt();
        while (pilaInicial <= 0) {
            System.out.println("La batería debe ser mayor a 0.");
            System.out.print("Introduce la batería inicial (%): ");
            pilaInicial = teclado.nextInt();
        }

        System.out.println("Batería inicial: " + pilaInicial + "%");
        if (pilaInicial < CONSUMO_MINUTO) {
            System.out.println("No es suficiente la pila introducida, debe ser mayor o igual a 7 para volar");
        } else {
            int pilaActual = pilaInicial;
            int tiempo = 1;

            while (pilaActual >= CONSUMO_MINUTO) {
                pilaActual -= CONSUMO_MINUTO;
                System.out.println("Minuto " + tiempo + " -> " + pilaActual + "%");
                tiempo++;
            }
        }
    }
}