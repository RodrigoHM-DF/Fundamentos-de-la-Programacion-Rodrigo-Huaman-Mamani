
class Palindromo {
    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }
}
