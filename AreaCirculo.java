import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Radio del Circulo: ");
        double radio = scanner.nextInt();

        double AreaCirculo = Math.PI * radio * Math.pow(radio, 2);

        System.out.println("El area del circulo es: "+AreaCirculo);

        scanner.close();
    }
}