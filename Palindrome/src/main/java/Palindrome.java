import java.util.HashSet;

public class Palindrome {
    public static int getPalindromeLength(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> characterHashSet = new HashSet<>();
        char[] charArray = s.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (!characterHashSet.contains(charArray[i])) {
                characterHashSet.add(charArray[i]);
            } else {
                characterHashSet.remove(charArray[i]);
                count++;
            }
        }
        return characterHashSet.isEmpty() ? count * 2 : count * 2 + 1;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

}
