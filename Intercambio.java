
class Intercambio {
    public static int[] intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
