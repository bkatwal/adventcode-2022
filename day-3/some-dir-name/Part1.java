import java.util.HashSet;
import java.util.Set;

public class Part1 {

    public static void main(String[] args) {

        System.out.println(calculate(InputDay3.SMALL_INPUT));
        System.out.println(calculate(InputDay3.LARGE_INPUT));
    }

    public static long calculate(String input) {

        long res = 0;

        String[] allRuckItems = input.split("\n");

        for (String ruckItems : allRuckItems) {

            int len = ruckItems.length();

            int l = 0;

            Set<Character> left = new HashSet<>();
            Set<Character> right = new HashSet<>();

            int r = len - 1;
            while (l < len / 2) {
                left.add(ruckItems.charAt(l));
                right.add(ruckItems.charAt(r));
                r--;
                l++;
            }

            left.retainAll(right);

            for (Character ch : left) {
                if (Character.isLowerCase(ch)) {
                    res = res + ch - 96;
                } else {
                    res = res + ch - 38;
                }
            }

        }

        return res;
    }
}
