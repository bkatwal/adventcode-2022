import java.util.PriorityQueue;

public class CalorieCountingTop3 {

    public static void main(String[] args) {
        System.out.println(getTopNMaxCalories(InputDay1.LARGE_INPUT, 3));
    }

    public static long getTopNMaxCalories(String input, int k) {

        PriorityQueue<Long> pq = new PriorityQueue<>((x, y) -> Long.compare(y, x));

        String[] calories = input.split("\n\n");

        for (String calPerElf : calories) {
            String[] cals = calPerElf.split("\n");
            long cal = 0;
            for (String calStr : cals) {
                cal = cal + Long.parseLong(calStr);
            }

            pq.offer(cal);
        }

        long total = 0;

        while (k > 0) {
            total = total + pq.poll();
            k--;
        }

        return total;
    }
}
