import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\+");
        Solution solution = new Solution();

        ListNode linkedList1 = solution.processInput(inputArray[0]);
        ListNode linkedList2 = solution.processInput(inputArray[1]);
        ListNode result = solution.addTwoNumbers(linkedList1, linkedList2);
        solution.output(result);

    }
}
