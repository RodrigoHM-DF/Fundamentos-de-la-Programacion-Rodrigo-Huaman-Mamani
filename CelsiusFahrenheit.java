import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los Grados Celsius: ");
        double C = scanner.nextDouble();

        double F = (C*9/5)+32;

        System.out.println("Los grados Fahreheit son: "+F);
        
        scanner.close();
    }
}