import java.util.Scanner;

public  class VolumenDeEsfera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Radio de la Esfera: ");
        double r = scanner.nextInt();

        double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("El volumen de la esfera con radio %.2f es: %.4f\n", r, v);


        scanner.close();
    }
}