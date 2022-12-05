import java.util.*;

public class Day5Part2 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(calculate(InputDay6.SMALL_INPUT));
        System.out.println(calculate(InputDay6.LARGE_INPUT));
    }

    public static String calculate(String input) {
        String res = "";

        String[] inputs = input.split("\n\n");

        String stacks = inputs[0];

        List<List<Character>> allStacks = Day5Util.getStacks(stacks);

        String[] moves = inputs[1].split("\n");

        for (String move : moves) {
            int[] moveArr = Day5Util.getMove(move);
            moveCrates(allStacks.get(moveArr[1] - 1), allStacks.get(moveArr[2] - 1), moveArr[0]);
        }


        for (List<Character> stack : allStacks) {
            res = res + stack.get(stack.size() - 1) + "";
        }
        return res;
    }

    private static void moveCrates(List<Character> from, List<Character> to, int k) {

        int i = 0;
        int j = from.size() - k;

        while (i < k) {
            to.add(from.get(j++));
            i++;
        }

        i = 0;
        while (i < k) {
            from.remove(from.size() - 1);
            i++;
        }
    }
}
