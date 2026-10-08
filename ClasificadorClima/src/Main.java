import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("CLASIFICADOR DE CLIMA");
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca la temperatura en °C: ");
        double temperaturaC = teclado.nextDouble();

        if (temperaturaC <10) {
            System.out.println("Frío extremo");
        } else if (temperaturaC <=20) {
            System.out.println("Clima fresco");
        } else if (temperaturaC <=30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }
    }
}