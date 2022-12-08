import java.util.*;

public class Day8Part1 {

    public static void main(String[] args) {
        System.out.println(calculate(InputDay8.SMALL_INPUT));
        System.out.println(calculate(InputDay8.LARGE_INPUT));
    }

    public static int calculate(String input) {

        int res = 0;
        String[] allRows = input.split("\n");


        char[][] matrix = new char[allRows.length][allRows[0].length()];

        int i = 0;
        for (String row : allRows) {

            matrix[i++] = row.toCharArray();
        }

        for (int j = 1; j < matrix.length - 1; j++) {
            for (int k = 1; k < matrix[0].length - 1; k++) {

                if (canSee(matrix, j, k)) {
                    res = res + 1;
                }
            }
        }

        res = res + matrix.length + matrix.length + matrix[0].length + matrix[0].length - 4;
        return res;
    }

    private static boolean canSee(char[][] matrix, int i, int j) {

        int[][] directions = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        for (int[] direction : directions) {
            boolean canSee = true;
            for (int k = i + direction[0], l = j + direction[1];
                 k >= 0 && k < matrix.length && l >= 0 && l < matrix[0].length;
                 k = k + direction[0], l = l + direction[1]) {
                if (matrix[k][l] >= matrix[i][j]) {
                    canSee = false;
                    break;
                }
            }
            if (canSee) {
                return true;
            }
        }

        return false;
    }

}
