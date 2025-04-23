import java.util.Scanner;

public class MinutosAHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de minutos: ");
        int totalMinutos = scanner.nextInt();

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println(totalMinutos + " minutos equivalen a " + horas + " hora(s) y " + minutos + " minuto(s).");

        scanner.close();
    }
}
