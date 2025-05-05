
class Armstrong {
    public static boolean isArmstrong(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(c), len);
        }
        return sum == num;
    }
}
