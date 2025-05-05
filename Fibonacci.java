
class Fibonacci {
    public static void imprimirFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }
}
