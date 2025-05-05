
class ContarOcurrencias {
    public static int contar(int[] arreglo, int valor) {
        int contador = 0;
        for (int num : arreglo) {
            if (num == valor) contador++;
        }
        return contador;
    }
}
