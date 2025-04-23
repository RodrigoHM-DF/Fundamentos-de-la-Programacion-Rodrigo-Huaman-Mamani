import java.util.Scanner;

public class SumaDeDosNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inrgese el Primer Numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el Segundo Nuemero: ");
        int num2 = scanner.nextInt();

        int reslutado = num1 + num2;

        System.out.println("El Resultado de la Suma es: "+reslutado);

        scanner.close();
    }
}