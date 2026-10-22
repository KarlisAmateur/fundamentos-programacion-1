import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        final int PAGO_HORA= 15;
        final int DESCUENTO= 10;
        int cantHoras = 1;
        int cantAutos = 0;
        int cantDescuento = 0;
        double pagoVehiculo = 0;
        double dineroRecaudado = 0;

        System.out.println("-CONTROL ESTACIONAMIENTO-");
        while (cantHoras != 0){
            System.out.printf("Introduzca la cantidad de horas del vehiculo " + (cantAutos+1) +" en el estacionamiento (0 para salir): ");
                    cantHoras = teclado.nextInt();
            while (cantHoras <0){
                System.out.println("Las horas no pueden ser negativos");
                System.out.printf("Introduzca la cantidad de horas del vehiculo " + (cantAutos+1) +" en el estacionamiento (0 para salir): ");
                cantHoras = teclado.nextInt();
            }

            if (cantHoras > 5){
                pagoVehiculo = (cantHoras * PAGO_HORA)- DESCUENTO;
                System.out.println("Pago del vehiculo " + (cantAutos+1) +" con descuento de 10 pesos: $"+pagoVehiculo);
                cantDescuento++;
            }
            else{
                pagoVehiculo = cantHoras * PAGO_HORA;
                System.out.println("Pago del vehiculo " + (cantAutos+1) +" : $"+pagoVehiculo);
            }

            if (cantHoras != 0){
                cantAutos++;
            }
            dineroRecaudado += pagoVehiculo;
        }
        double promedioDinero = dineroRecaudado / cantAutos;

        System.out.println("-RESUMEN DEL DIA EN EL ESTACIONAMIENTO-");
        System.out.println("Cantidad de automóviles atendidos: "+ cantAutos);
        System.out.println("Total de dinero recaudado: $" + dineroRecaudado);
        System.out.println("Cantidad de automóviles que recibieron descuento: "+ cantDescuento);
        System.out.println("Promedio pagado por automóvil: $"+ promedioDinero);
    }
}