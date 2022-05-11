import java.util.Scanner;

public class Solution {
    public static int getBracketPairDepth(String string) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        System.out.println(getBracketPairDepth(string));
    }
}
