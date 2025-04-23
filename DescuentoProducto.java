import java.util.Scanner;

public class DescuentoProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double montoDescuento = precio * (descuento / 100);
        double precioFinal = precio - montoDescuento;

        System.out.println("El precio final después del descuento es: " + precioFinal);

        scanner.close();
    }
}
