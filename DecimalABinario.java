
class DecimalToBinary {
    public static String convert(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary.equals("") ? "0" : binary;
    }
}
