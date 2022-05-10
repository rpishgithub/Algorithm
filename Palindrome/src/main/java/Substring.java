public class Substring {
    private int index, length;

    public void substringTest(String string, int left, int right) {
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left--;
            right++;
        }
        if (length < right - left - 1) {
            index = left + 1;
            length = right - left - 1;
        }
    }

    public String getLongestPalindromeSubstring(String string) {
        if (string.length() < 2) {
            return string;
        }
        for (int i = 0; i < string.length() - 1; i++) {
            substringTest(string, i, i);
            substringTest(string, i, i + 1);
        }
        return string.substring(index, index+length);
    }
}
