import java.util.Scanner;
//Karla Janet Amador Albarrán
public class Main {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       System.out.println("-PAQUETERIA-");
       double pesoPaquete =0;
       int numpaquete =0;
       int paquetesRechazados=0;
       int paquetesAceptados=0;
       double envio=0;
       double envioTotal;
       int cantFragil=0;
       int rechazado =0;
       double dineroRecaudado=0;
       String tipoEnvio=" ";
       double mayorPaquete=0;

    do{
           System.out.printf("Introduzca el peso del paquete "+ (numpaquete+1)+ " (0 para salir): ");
           pesoPaquete = teclado.nextDouble();
           while (pesoPaquete < 0){
               System.out.println("El peso no puede ser negativo");
               System.out.printf("Introduzca el peso del paquete "+ (numpaquete+1)+ " (0 para salir): ");
               pesoPaquete = teclado.nextDouble();
           }
           numpaquete++;
       if (pesoPaquete!=0){
           int opc =0;
           System.out.println("TIPO DE ENVIO");
           System.out.println("1) Local");
           System.out.println("2) Nacional");
           System.out.println("3) Express");
           System.out.printf("Elija una opción: ");
           opc = teclado.nextInt();
                while (opc !=1 && opc !=2 && opc!=3){
                    System.out.println("OPCIÓN INVALIDA");
                    System.out.println("");
                    System.out.println("TIPO DE ENVIO");
                    System.out.println("1) Local");
                    System.out.println("2) Nacional");
                    System.out.println("3) Express");
                    System.out.printf("Elija una opción: ");
                    opc = teclado.nextInt();
                }

               switch (opc){
                   case 1:
                       if (pesoPaquete > 12){
                           System.out.println("Paquete rechazado");
                           rechazado=1;

                       } else {
                           envio = 30+(8*pesoPaquete);
                           tipoEnvio= "Local";
                       }
                   break;
                   case 2:
                       if (pesoPaquete > 20){
                           System.out.println("Paquete rechazado");
                           rechazado=1;
                       } else {
                           envio = 50+(12*pesoPaquete);
                           tipoEnvio= "Nacional";
                       }
                   break;
                   case 3:
                       if (pesoPaquete > 5){
                           System.out.println("Paquete rechazado");
                           rechazado=1;
                       } else {
                           envio = 80+(20*pesoPaquete);
                           tipoEnvio= "Express";
                       }
                   break;
               }
               if (rechazado!=1){
                   paquetesAceptados++;
                   System.out.printf("¿Es fragil? 1)SI  2)NO");
                   int fragil = teclado.nextInt();
                   while (fragil!=1 && fragil!=2){
                       System.out.println("OPCIÓN INVALIDA");
                       System.out.printf("¿Es fragil? 1)SI  2)NO  : ");
                       fragil = teclado.nextInt();
                   }
                   if (fragil==1){
                       envioTotal = envio +25;
                       cantFragil++;
                   } else {
                       envioTotal = envio;
                   }
                   if (envioTotal>mayorPaquete){
                       mayorPaquete=envioTotal;
                   }
                   dineroRecaudado= dineroRecaudado+envioTotal;

                   System.out.println("");
                   System.out.println("RESUMEN PAQUETE");
                   System.out.println("Tipo envio: "+tipoEnvio);
                   System.out.println("Peso en kg: "+pesoPaquete);
                   System.out.println("Total a pagar: $"+envioTotal);
               }else {
                   paquetesRechazados++;
               }
       }
    }while (pesoPaquete!=0);
       System.out.println("Paqutes aceptados: "+paquetesAceptados);
       System.out.println("Paqutes aceptados: "+paquetesRechazados);
       System.out.println("Dinero Recaudado: $"+dineroRecaudado);
       System.out.println("Paqutes fragiles: "+cantFragil);
       System.out.println("Paquete más cosotoso: $"+ mayorPaquete);
    }
}