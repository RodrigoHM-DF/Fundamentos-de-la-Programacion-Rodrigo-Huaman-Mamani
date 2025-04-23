import java.util.Scanner;

public class VelocidadMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia recorrida (en km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Introduce el tiempo empleado (en horas): ");
        double tiempo = scanner.nextDouble();

        if (tiempo != 0) {
            double velocidadMedia = distancia / tiempo;
            System.out.printf("La velocidad media es: %.2f km/h%n ", velocidadMedia);
        } else {
            System.out.println("El tiempo no puede ser cero.");
        }

        scanner.close();
    }
}
