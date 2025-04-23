import java.util.Scanner;

public class PromedioDeTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Primer Numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el Segundo Numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el Tercer Numero: ");
        int num3 = scanner.nextInt();

        int promedio = (num1 + num2 + num3)/3;

        System.out.println("El Promedio de los Tres Numeros es: "+promedio);
    }
}