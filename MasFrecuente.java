
import java.util.HashMap;
class MasFrecuente {
    public static int encontrar(int[] arreglo) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        int maxFreq = 0, resultado = arreglo[0];
        for (int num : arreglo) {
            int freq = mapa.getOrDefault(num, 0) + 1;
            mapa.put(num, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                resultado = num;
            }
        }
        return resultado;
    }
}
