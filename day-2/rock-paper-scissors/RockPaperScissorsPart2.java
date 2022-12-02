import java.util.HashMap;
import java.util.Map;

public class RockPaperScissorsPart2 {

    public static void main(String[] args) {

        System.out.println(findScore(InputDay2.LARGE_INPUT));
    }

    public static long findScore(String input) {
        Map<String, Integer> abcMap = new HashMap<>();
        abcMap.put("A", 1);
        abcMap.put("B", 2);
        abcMap.put("C", 3);

        long result = 0;
        String[] strs = input.split("\n");
        for (String str : strs) {

            String[] s = str.split(" ");
            String first = s[0];
            String second = s[1];
            result = result + getRequiredShapeScore(first, second, abcMap);
        }
        return result;
    }

    //13187
    private static int getRequiredShapeScore(String opponentChoice, String resultNeeded,
                                             Map<String, Integer> choiceScoreMap) {
        // 1->3->2
        // r->s->p
        // going for draw
        if (resultNeeded.equals("Y")) {
            return choiceScoreMap.get(opponentChoice) + 3;
        }

        if (opponentChoice.equals("A")) {
            // lose
            if (resultNeeded.equals("X")) {
                return choiceScoreMap.get("C");
            } else {
                return choiceScoreMap.get("B") + 6;
            }
        }

        if (opponentChoice.equals("B")) {
            if (resultNeeded.equals("X")) {
                return choiceScoreMap.get("A");
            } else {
                return choiceScoreMap.get("C") + 6;
            }
        }

        if (opponentChoice.equals("C")) {
            if (resultNeeded.equals("X")) {
                return choiceScoreMap.get("B");
            } else {
                return choiceScoreMap.get("A") + 6;
            }
        }

        return 0;
    }

}

//15022
