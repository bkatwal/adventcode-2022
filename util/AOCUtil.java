import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public final class AOCUtil {

    public static Set<Character> convertStringToSet(String str) {

        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        return set;
    }

    public static int getCharVal(char c, int startIndex) {

        if (Character.isLowerCase(c)) {
            return c - 97 + startIndex;
        }
        return c - 65 + startIndex;
    }


    public static int getTopKSum(PriorityQueue<Integer> pq, int k) {

        if (pq == null) {
            throw new RuntimeException("null heap");
        }
        int total = 0;

        while (k > 0 && !pq.isEmpty()) {
            total = total + pq.poll();
            k--;
        }

        return total;
    }

    public static Set<Character> getCharSet(String s, int start, int end) {

        Set<Character> set = new HashSet<>();

        for (int i = start; i < end; i++) {
            set.add(s.charAt(i));
        }

        return set;
    }

    public static boolean doesOverlap(int x1, int x2, int y1, int y2) {

        return (x1 >= y1 && x1 <= y2) ||
                (x2 >= y1 && x2 <= y2) ||
                (y1 >= x1 && y1 <= x2) ||
                (y2 >= x1 && y2 <= x2);

    }

    public static boolean doesFullOverlap(int x1, int x2, int y1, int y2) {

        return (x1 <= y1 && x2 >= y2) || (y1 <= x1 &&
                y2 >= x2);
    }
}

