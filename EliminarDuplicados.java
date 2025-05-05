
import java.util.*;
class EliminarDuplicados {
    public static int[] eliminar(int[] arreglo) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arreglo) {
            set.add(num);
        }
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }
}
