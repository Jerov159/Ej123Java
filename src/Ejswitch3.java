public class EjemploSwitch {
    public static void main(String[] args) {
        // Definir un día de la semana (1 para Lunes, 2 para Martes, etc.)
        int diaDeLaSemana = 3;

        // Utilizar switch para imprimir el nombre del día correspondiente
        String nombreDelDia;

        switch (diaDeLaSemana) {
            case 1:
                nombreDelDia = "Lunes";
                break;
            case 2:
                nombreDelDia = "Martes";
                break;
            case 3:
                nombreDelDia = "Miércoles";
                break;
            case 4:
                nombreDelDia = "Jueves";
                break;
            case 5:
                nombreDelDia = "Viernes";
                break;
            case 6:
                nombreDelDia = "Sábado";
                break;
            case 7:
                nombreDelDia = "Domingo";
                break;
            default:
                nombreDelDia = "Día no válido";
        }

        System.out.println("El día " + diaDeLaSemana + " es " + nombreDelDia);
    }
}
