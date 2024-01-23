import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        double descuento = (montoCompra > 100) ? 0.1 * montoCompra : 0; // 10% de descuento si la compra es mayor a 100
        double montoTotal = montoCompra - descuento;

        System.out.println("Monto de descuento: " + descuento);
        System.out.println("Monto total a pagar: " + montoTotal);
    }
}
