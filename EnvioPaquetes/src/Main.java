public class Main {
    public static void main(String[] args) {
        mostrarEtiqueta("AMATEUR1", "Temixco", 5.0);
        mostrarEtiqueta("KARLA203", "Toluca", 9.8);
    }
    static void mostrarEtiqueta(String numGuia, String ciudadDestino, double peso) {
        System.out.println("-ETIQUETA DE ENVÍO-");
        System.out.println("Número de guía: " + numGuia);
        System.out.println("Ciudad de destino: " + ciudadDestino);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println(" ");
    }
}