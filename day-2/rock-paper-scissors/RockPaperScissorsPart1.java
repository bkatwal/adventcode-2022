import java.util.HashMap;
import java.util.Map;

public class RockPaperScissorsPart1 {

    public static void main(String[] args) {
        System.out.println(findScore(InputDay2.LARGE_INPUT));
    }

    public static long findScore(String input) {

        Map<String, Integer> xyzMap = new HashMap<>();
        xyzMap.put("X", 1);
        xyzMap.put("Y", 2);
        xyzMap.put("Z", 3);
        long result = 0;

        String[] strs = input.split("\n");
        for (String str : strs) {

            String[] s = str.split(" ");
            String first = s[0];
            String second = s[1];

            if (whoWin(first, second).equals("b")) {

                result = result + xyzMap.get(second) + 6;
            } else if (whoWin(first, second).equals("a")) {
                result = result + xyzMap.get(second);
            } else if (whoWin(first, second).equals("-")) {
                result = result + xyzMap.get(second) + 3;
            }
        }
        return result;
    }

    private static String whoWin(String a, String b) {

        // draw scenarios
        if ((a.equals("A") && b.equals("X")) || (a.equals("B") && b.equals("Y")) || (a.equals("C") && b.equals("Z"))) {
            return "-";
        }
        // a winning scenarios
        if (a.equals("B") && b.equals("X")) {
            return "a";
        }
        if (a.equals("A") && b.equals("Z")) {
            return "a";
        }

        if (a.equals("C") && b.equals("Y")) {
            return "a";
        }

        // else b wins
        return "b";
    }
}
