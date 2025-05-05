
class ContarPalabras {
    public static int contar(String texto) {
        String[] palabras = texto.trim().split("\s+");
        return texto.trim().isEmpty() ? 0 : palabras.length;
    }
}
