
class NumeroPerfecto {
    public static boolean esPerfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) suma += i;
        }
        return suma == n;
    }
}
