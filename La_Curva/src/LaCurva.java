public class LaCurva {
    public static void main (String[] args){
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};
        imprimirCalificaciones(calificaciones);
        curvaCalificaciones(calificaciones);
        imprimirCalificaciones(calificaciones);
        contarAprobados(calificaciones);

    }
    static void imprimirCalificaciones (int [] arregloCalif){
        System.out.println(" ");
        System.out.println("-CALIFICACIONES-");
        for (int i=0; i<arregloCalif.length; i++){
            System.out.println("Alumno "+ (i+1) + ": "+ arregloCalif[i]);
        }
    }
    static void curvaCalificaciones (int [] arregloCalif){
        for (int i=0; i<arregloCalif.length; i++){
            arregloCalif [i]=arregloCalif[i] + 5;
            if (arregloCalif[i] >100){
                arregloCalif[i]=100;
            }
        }
    }
    static void contarAprobados (int [] arregloCalif){
        int aprobados=0;
        for (int i=0; i<arregloCalif.length; i++){
            if (arregloCalif[i] >=70){
                aprobados++;
            }
        }
        System.out.printf("Cantidad de aprobados: "+aprobados);
    }
}
