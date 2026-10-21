import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        final int SUMAR_PUNTOS=20;
        final int RESTAR_PUNTOS=15;
        int puntos = 100;
        int opc;
        do{
            System.out.println("-MENÚ DE PUNTOS-");
            System.out.println("1) Ganar 20 puntos");
            System.out.println("2) Gastar 15 puntos");
            System.out.println("3) Consultar puntos");
            System.out.println("4) Salir");
            System.out.printf("Introduzca una opción del menú: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    puntos+=SUMAR_PUNTOS;
                    System.out.println("+20 puntos");
                    break;
                case 2:
                    if (puntos < 15){
                        System.out.println("No tienes suficientes puntos para gastar");
                    }else {
                        puntos-=RESTAR_PUNTOS;
                        System.out.println("-15 puntos");
                    }
                    break;
                case 3:
                    System.out.println("Puntos acumulados: "+puntos);
                    break;
                case 4:
                    System.out.println("Los puntos restantes fueron: "+puntos);
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while(opc != 4);
    }
}