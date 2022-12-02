public class CalorieCounting {

    public static void main(String[] args) {
        System.out.println(getMaxCalories(InputDay1.LARGE_INPUT));
    }

    public static long getMaxCalories(String input) {

        String[] calories = input.split("\n\n");

        long maxCalPerElf = 0;

        for (String calPerElf : calories) {
            String[] cals = calPerElf.split("\n");
            long cal = 0;
            for (String calStr : cals) {
                cal = cal + Long.parseLong(calStr);
            }
            maxCalPerElf = Math.max(cal, maxCalPerElf);
        }

        return maxCalPerElf;
    }
}
