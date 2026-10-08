import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double DESCUENTO = 0.2;
        System.out.println("RENTA DE BICICLETAS");
        System.out.println("1) Bicicleta urbana: $40 por hora");
        System.out.println("2) Bicicleta de montaña: $60 por hora");
        System.out.println("3) Bicicleta eléctrica: $90 por hora");
        System.out.printf("Elige tu tipo de bicicleta (1-3): ");
        int opcionBici = teclado.nextInt();

        double tarifaHora = 0;
        String nameBici = "";
        boolean opcValida = true;
        switch (opcionBici) {
            case 1:
                nameBici = "Urbana";
                tarifaHora = 40.0;
                break;
            case 2:
                nameBici = "Montaña";
                tarifaHora = 60.0;
                break;
            case 3:
                nameBici = "Eléctrica";
                tarifaHora = 90.0;
                break;
            default:
                opcValida = false;
        }

        if (opcValida == false) {
            System.out.println("Opcion no valida");
        } else {
            System.out.print("Introduzca la cantidad de horas rentadas: ");
            int horasRentadas = teclado.nextInt();

            if (horasRentadas > 0) {
                double subTotal = horasRentadas * tarifaHora;
                double descuento = 0.0;

                System.out.printf("¿Tiene membrecia? (true/false): ");
                boolean membrecia = teclado.nextBoolean();
                if (membrecia == true){
                    descuento= subTotal * DESCUENTO;
                }
                double totalPagar = subTotal - descuento;
                System.out.println("TICKET BICICLETAS RENTA");
                System.out.println("TIPO DE BICIBLETA RENTADA: "+nameBici);
                System.out.println("SUBTOTAL: $: "+subTotal);
                System.out.println("DESCUENTO: $"+descuento);
                System.out.println("TOTAL A PAGAR: $"+totalPagar);

            } else {
                System.out.println("Opcion no valida, las horas deben ser mayor a 0");
            }
        }
    }
}