import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("ACCESO AL SISTEMA ACADÉMICO");
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Introduzca el nombre del alumno: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduzca el promedio (0-10) de "+nombre+ ": ");
        double promedio = teclado.nextDouble();
        if (promedio >= 7.0){
            System.out.print("Introduzca el porcentaje de asistencia (0%-100%) de "+nombre+ ": ");
            double asistencia = teclado.nextDouble();

            if (asistencia >= 80){
                System.out.println("Aprobado regular");
            } else {
                System.out.println("Reprobado por faltas");
            }
        } else {
            System.out.println("Reprobado por calificación");
        }
    }
}