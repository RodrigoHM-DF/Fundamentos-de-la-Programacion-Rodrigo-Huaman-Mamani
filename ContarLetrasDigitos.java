
class ContarLetrasDigitos {
    public static int[] contar(String texto) {
        int letras = 0, digitos = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) letras++;
            else if (Character.isDigit(c)) digitos++;
        }
        return new int[]{letras, digitos};
    }
}
