
class ContarVocales {
    public static int contar(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
