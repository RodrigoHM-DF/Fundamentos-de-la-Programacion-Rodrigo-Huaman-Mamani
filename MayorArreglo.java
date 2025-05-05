
class MayorArreglo {
    public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) mayor = num;
        }
        return mayor;
    }
}
