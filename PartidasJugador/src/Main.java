import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("-LAS 7 PARTIDAS DEL JUGADOR-");
        final double CANTIDAD_PARTIDAS= 7.0;
        int puntosPartida = 0;
        int puntosAcu = 0;
        int partidasMayores = 0;
        int partidasMenores = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.printf("Introduzca la puntuación optenida de la partida " + i + ": ");
            puntosPartida = teclado.nextInt();
            while (puntosPartida <0){
                System.out.println("Los puntos no pueden ser negativos");
                System.out.printf("Introduzca la puntuación optenida de la partida " + i + ": ");
                puntosPartida = teclado.nextInt();
            }
            puntosAcu+=puntosPartida;
            if (puntosPartida > 1000)
                partidasMayores++;
            else
                partidasMenores++;
        }

        double promedio = puntosAcu / CANTIDAD_PARTIDAS;
        System.out.println("Puntos Acumulados: "+ puntosAcu);
        System.out.println("Promedio de puntos en las 7 partidas: "+ promedio);
        System.out.println("PCantidad de partidas con más de 1000 puntos: "+ partidasMayores);
        System.out.println("PCantidad de partidas con 1000 puntos o menos: "+ partidasMenores);
    }
}