
class Potencia {
    public static long elevar(int base, int exponente) {
        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
