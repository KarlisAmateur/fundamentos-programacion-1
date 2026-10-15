import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("ELEVADOR");
        System.out.print("Introduzca el piso donde esta: ");
        int pisoEstancia = teclado.nextInt();
        while (pisoEstancia <=0){
            System.out.println("El piso de estancia debe ser mayor a 0");
            System.out.print("Introduzca el piso donde esta: ");
            pisoEstancia = teclado.nextInt();
        }
        System.out.print("Introduzca el piso a donde quiere ir: ");
        int pisoDeseado = teclado.nextInt();
        while (pisoDeseado <= 0 || pisoEstancia == pisoDeseado) {
            if (pisoDeseado <= 0) {
                System.out.println("El piso deseado debe ser mayor a 0");
            } else if (pisoEstancia == pisoDeseado) {
                System.out.println("El piso deseado y de estancia no pueden ser los mismos");
            }
            System.out.print("Introduzca el piso a donde quiere ir: ");
            pisoDeseado = teclado.nextInt();
        }

            if (pisoEstancia < pisoDeseado){
                while (pisoEstancia < pisoDeseado){
                    pisoEstancia++;
                    System.out.println(pisoEstancia);
                }
            }else {
                while (pisoEstancia > pisoDeseado){
                    pisoEstancia--;
                    System.out.println(pisoEstancia);
                }
            }

    }
}