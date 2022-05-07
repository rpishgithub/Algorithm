import java.util.Arrays;

public class Solution {
    public static boolean isStringEmpty(String[] strings) {
        if (strings == null) {
            return true;
        } else {
            for (String string : strings) {
                if (string == null || string.length() == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static String getLongestCommonPrefix(String[] strings) {
        if (isStringEmpty(strings)) {
            return "";
        }
        int arr_len = strings.length;
        StringBuilder result = new StringBuilder();
        Arrays.sort(strings);
        int first_len = strings[0].length();
        int last_len = strings[arr_len - 1].length();
        int min = Math.min(first_len, last_len);
        for (int i = 0; i < min; i++) {
            if (strings[0].charAt(i) == strings[arr_len - 1].charAt(i)) {
                result.append(strings[0].charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"customer", "car", "cat", "card"};
        System.out.println(getLongestCommonPrefix(strings));
    }
}
