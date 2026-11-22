import java.util.Scanner;

public class CalificacionesArreglos {
    public static void main(String[] args) {
        System.out.println("-REGISTRO CALIFICACIONES-");
        int[] arregloCalificaciones = capturarCalificaciones();
        mostrarCalificaciones(arregloCalificaciones);
        int aprobados = contarAprobados(arregloCalificaciones);
        int reprobados = contarReprobados(arregloCalificaciones);
        System.out.println(" ");
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }

    static int[] capturarCalificaciones() {
        Scanner teclado = new Scanner(System.in);
        int[] IngresarCalificaciones = new int[10];

        for (int i = 0; i < IngresarCalificaciones.length; i++) {
            int calificacion;
            System.out.print("Introduzca la calificación para el alumno " + (i+1) + " (0-100): ");
            calificacion = teclado.nextInt();
            while (calificacion < 0 || calificacion > 100){
                System.out.println("La calificación debe estar entre 0 y 100");
                System.out.print("Introduzca la calificación para el alumno " + (i+1) + " (0-100): ");
                calificacion = teclado.nextInt();
            }
            IngresarCalificaciones[i] = calificacion;
        }
        return IngresarCalificaciones;
    }

    static void mostrarCalificaciones(int[] verCalificaciones) {
        System.out.println(" ");
        System.out.println("-CALIFICACIONES-");
        for (int i = 0; i < verCalificaciones.length; i++) {
            System.out.println("Alumno " + (i+1) + ": " + verCalificaciones[i]);
        }
    }

    static int contarAprobados(int[] calificacionesAprobatorias) {
        int cantidadAprobados = 0;
        for (int i = 0; i < calificacionesAprobatorias.length; i++) {
            if (calificacionesAprobatorias[i] >= 70) {
                cantidadAprobados++;
            }
        }
        return  cantidadAprobados;
    }

    static int contarReprobados(int[] calificacionesReprobatorias) {
        int cantidadReprobados = 0;
        for (int i = 0; i < calificacionesReprobatorias.length; i++) {
            if (calificacionesReprobatorias[i] < 70) {
                cantidadReprobados++;
            }
        }
        return cantidadReprobados;
    }
}