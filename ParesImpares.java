
class ParesImpares {
    public static int[] contar(int[] arreglo) {
        int pares = 0, impares = 0;
        for (int num : arreglo) {
            if (num % 2 == 0) pares++;
            else impares++;
        }
        return new int[]{pares, impares};
    }
}
