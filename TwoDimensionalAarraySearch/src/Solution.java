public class Solution {
    public static boolean Find(int target, int[][] array) {
        int row = array.length-1;
        int column = 0;
        while (row >= 0 && column < array[row].length) {
            if (array[row][column] > target) {
                row--;
            } else if (array[row][column] < target) {
                column++;
            } else {
                return true;
            }
        }
        return false;
    }
}