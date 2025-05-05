
class Capicua {
    public static boolean esCapicua(int num) {
        String s = String.valueOf(num);
        String reverso = new StringBuilder(s).reverse().toString();
        return s.equals(reverso);
    }
}
