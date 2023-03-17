package fr.istic.vv;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isBalanced(String str) {
        if (str == null) return false;
        int parentheses = 0;
        int brackets = 0;
        int squareBrackets = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '{':
                    brackets++;
                    break;
                case '}':
                    brackets--;
                    break;
                case '[':
                    squareBrackets++;
                    break;
                case ']':
                    squareBrackets--;
                    break;
                case '(':
                    parentheses++;
                    break;
                case ')':
                    parentheses--;
                    break;
            }
        }
        return (parentheses == brackets && brackets == squareBrackets && brackets == 0);
    }
}
