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
        final double   TARIFA_URBANA = 40.0;
        final double   TARIFA_MONTANA = 60.0;
        final double   TARIFA_ELECTRICA = 90.0;

        double tarifaHora = 0;
        String nameBici ;
        boolean opcValida = true;
        switch (opcionBici) {
            case 1:
                nameBici = "Urbana";
                tarifaHora = TARIFA_URBANA;
                break;
            case 2:
                nameBici = "Montaña";
                tarifaHora = TARIFA_MONTANA;
                break;
            case 3:
                nameBici = "Eléctrica";
                tarifaHora = TARIFA_ELECTRICA;
                break;
            default:
                opcValida = false;
                nameBici="Bici inexistente";
        }

        if (!opcValida) {
            System.out.println(nameBici);
        } else {
            System.out.print("Introduzca la cantidad de horas rentadas: ");
            int horasRentadas = teclado.nextInt();

            if (horasRentadas > 0) {
                double subTotal = horasRentadas * tarifaHora;
                double descuento = 0.0;

                System.out.printf("¿Tiene membrecia? (true/false): ");
                boolean membrecia = teclado.nextBoolean();
                if (membrecia){
                    descuento= subTotal * DESCUENTO;
                }
                double totalPagar = subTotal - descuento;
                System.out.println("-TICKET RENTA DE BICICLETAS-");
                System.out.println("TIPO DE BICIBLETA RENTADA: "+nameBici);
                System.out.println("SUBTOTAL: $"+subTotal);
                System.out.println("DESCUENTO: $"+descuento);
                System.out.println("TOTAL A PAGAR: $"+totalPagar);

            } else {
                System.out.println("Opcion no valida, las horas deben ser mayor a 0");
            }
        }
    }
}