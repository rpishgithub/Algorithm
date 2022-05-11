import java.util.List;

public class Solution {
    public static Integer stringToInteger(String string) {
        if (string.length() == 0) {
            return 0;
        }

        boolean isNegative = false;
        int start = 0;
        int result = 0;
        char[] charArray = string.toCharArray();
        if (charArray[0] == '-') {
            isNegative = true;
            start = 1;
        }
        for (int i = start; i < string.length(); i++) {
            if (Character.isDigit(charArray[i])) {
                result = result * 10 + charArray[i]-'0';
            } else {
                return 0;
            }
        }
        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(stringToInteger("-1200"));
    }
}
