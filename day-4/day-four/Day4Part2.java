public class Day4Part2 {

    public static void main(String[] args) {
        System.out.println(calculate(InputDay4.SMALL_INPUT));
        System.out.println(calculate(InputDay4.LARGE_INPUT));
    }

    public static long calculate(String input) {
        int res = 0;

        String[] allRows = input.split("\n");

        for (String row : allRows) {

            String[] pairs = row.split(",");

            String[] pair1 = pairs[0].split("-");
            String[] pair2 = pairs[1].split("-");


            if (AOCUtil.doesOverlap(Integer.parseInt(pair1[0]),
                    Integer.parseInt(pair1[1]),
                    Integer.parseInt(pair2[0]),
                    Integer.parseInt(pair2[1]))) {
                res++;
            }
        }
        return res;
    }
}
