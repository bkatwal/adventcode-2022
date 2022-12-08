import java.util.*;

public class Day8Part2 {

    public static void main(String[] args) {
        System.out.println(calculate1(InputDay8.SMALL_INPUT));
        System.out.println(calculate1(InputDay8.LARGE_INPUT));
    }

    public static int calculate1(String input) {

        int res = 0;
        String[] allRows = input.split("\n");


        char[][] matrix = new char[allRows.length][allRows[0].length()];

        int i = 0;
        for (String row : allRows) {

            matrix[i++] = row.toCharArray();
        }

        for (int j = 1; j < matrix.length - 1; j++) {
            for (int k = 1; k < matrix[0].length - 1; k++) {

                int scenicScore = findScenicScore(matrix, j, k);

                if (scenicScore > res) {
                    res = scenicScore;
                }
            }
        }


        return res;
    }

    private static int findScenicScore(char[][] matrix, int i, int j) {

        int[][] directions = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        int[] scores = new int[4];

        int r = 0;
        for (int[] direction : directions) {
            for (int k = i + direction[0], l = j + direction[1];
                 k >= 0 && k < matrix.length && l >= 0 && l < matrix[0].length;
                 k = k + direction[0], l = l + direction[1]) {
                if (matrix[k][l] >= matrix[i][j]) {
                    scores[r]++;
                    break;
                }
                scores[r]++;
            }
            r++;
        }

        return scores[0] * scores[1] * scores[2] * scores[3];
    }
}
