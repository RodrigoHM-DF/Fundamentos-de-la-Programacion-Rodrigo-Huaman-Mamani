
class PromedioArreglo {
    public static double calcular(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }
}
