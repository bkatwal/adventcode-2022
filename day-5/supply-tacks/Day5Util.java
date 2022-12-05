import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day5Util {

    public static List<List<Character>> getStacks(String input) {


        List<List<Character>> stacks = new ArrayList<>();

        String[] allRows = input.split("\n");

        int totalStacks = (allRows[0].length() + 1) / 4;

        while (totalStacks > 0) {
            stacks.add(new ArrayList<>(allRows.length - 1));
            totalStacks--;
        }

        for (int i = 0; i < allRows.length - 1; i++) {
            String row = allRows[i];
            int k = 0;
            for (int j = 1; j < row.length(); j = j + 4) {

                if (Character.isAlphabetic(row.charAt(j))) {
                    List<Character> stack = stacks.get(k);
                    stack.add(0, row.charAt(j));
                }
                k++;
            }
        }
        return stacks;
    }

    public static int[] getMove(String move) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(move).useDelimiter("[^\\d]+");

        int i = 0;
        while (sc.hasNext()) {
            arr[i++] = sc.nextInt();
        }

        return arr;
    }
}
