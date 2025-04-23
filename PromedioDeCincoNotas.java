import java.util.Scanner;

public class PromedioDeCincoNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Primera Nota: ");
        int not1 = scanner.nextInt();

        System.out.println("Ingrese la Segunda Nota: ");
        int not2 = scanner.nextInt();

        System.out.println("Ingrese la Tercera Nota: ");
        int not3 = scanner.nextInt();

        System.out.println("Ingrese la Cuarta Nota: ");
        int not4 = scanner.nextInt();

        System.out.println("Ingrese la Quinta Nota: ");
        int not5 = scanner.nextInt();

        int resultado = (not1 + not2 + not3 + not4 + not5) / 5;

        System.out.println("El promedio de las tres Notas es: "+resultado);
    }
}