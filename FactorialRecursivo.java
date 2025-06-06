
class Factorial {
    public static long factorial(int n) {
        if (n < 0) return -1; // caso inválido
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
