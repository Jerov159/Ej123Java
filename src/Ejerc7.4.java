import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String diaSemana = (numero >= 1 && numero <= 7) ?
                (numero == 1) ? "Domingo" :
                        (numero == 2) ? "Lunes" :
                                (numero == 3) ? "Martes" :
                                        (numero == 4) ? "Miércoles" :
                                                (numero == 5) ? "Jueves" :
                                                        (numero == 6) ? "Viernes" :
                                                                "Sábado" :
                "Número inválido";

        System.out.println("El día de la semana es: " + diaSemana);
    }
}
