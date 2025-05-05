
class BuscarEnArreglo {
    public static boolean buscar(int[] arreglo, int valor) {
        for (int num : arreglo) {
            if (num == valor) return true;
        }
        return false;
    }
}
