
class UniqueCharacters {
    public static String getUnique(String a, String b) {
        String result = "";
        for (char c : a.toCharArray()) {
            if (b.indexOf(c) == -1 && result.indexOf(c) == -1)
                result += c;
        }
        for (char c : b.toCharArray()) {
            if (a.indexOf(c) == -1 && result.indexOf(c) == -1)
                result += c;
        }
        return result;
    }
}
