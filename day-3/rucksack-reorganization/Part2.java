import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Part2 {

    public static void main(String[] args) {

        System.out.println(calculate(InputDay3.SMALL_INPUT));
        System.out.println(calculate(InputDay3.LARGE_INPUT));
    }

    public static long calculate(String input) {

        long res = 0;

        String[] allRuckItems = input.split("\n");
        for(int i = 0; i < allRuckItems.length;){


            Set<Character> set1 = convertStringToSet(allRuckItems[i]);
            Set<Character> set2 = convertStringToSet(allRuckItems[i + 1]);
            Set<Character> set3 = convertStringToSet(allRuckItems[i + 2]);

            set1.retainAll(set2);
            set1.retainAll(set3);

            char badge = set1.iterator().next();
            if (Character.isLowerCase(badge)) {
                res = res + badge - 96;
            } else {
                res = res + badge - 38;
            }

            i = i + 3;
        }
        return res;
    }

    private static Set<Character> convertStringToSet(String str){

        Set<Character> set = new HashSet<>();

        for(char c: str.toCharArray()){
            set.add(c);
        }

        return set;
    }
}
