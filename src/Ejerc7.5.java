import java.util.Scanner;

public class DescuentoAdicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        System.out.print("¿Es cliente frecuente? (true/false): ");
        boolean esClienteFrecuente = scanner.nextBoolean();

        // Aplicar un descuento adicional del 5% si el cliente es frecuente
        double descuentoAdicional = esClienteFrecuente ? 0.05 * montoCompra : 0;

        double montoTotal = montoCompra - descuentoAdicional;

        System.out.println("Monto de descuento adicional: " + descuentoAdicional);
        System.out.println("Monto total a pagar: " + montoTotal);
    }
}
