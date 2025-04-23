import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Base del Rectangulo: ");
        int base = scanner.nextInt();

        System.out.println("Ingrese la Altura del Rectangulo");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("El Area del Rectangulo es: "+area);

        scanner.close();
    }
}