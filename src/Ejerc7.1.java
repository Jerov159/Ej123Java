import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + resultado);
    }
}
