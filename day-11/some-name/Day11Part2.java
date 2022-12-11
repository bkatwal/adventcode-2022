import java.math.BigInteger;
import java.util.*;

public class Day11Part2 {

    private static List<MonkeyPar2> monkeys = new ArrayList<>();

    private static PriorityQueue<MonkeyPar2> pq =
            new PriorityQueue<>((a, b) -> Long.compare(b.totalInspected, a.totalInspected));

    public static void main(String[] args) {
        System.out.println("Part 1");
        System.out.println(calculate(InputDay11.SMALL_INPUT, "1", 20));
        monkeys = new ArrayList<>();
        System.out.println(calculate(InputDay11.LARGE_INPUT, "1", 20));
        monkeys = new ArrayList<>();

        System.out.println("Part 2");
        System.out.println(calculate(InputDay11.SMALL_INPUT, "2", 10000));
        monkeys = new ArrayList<>();
        System.out.println(calculate(InputDay11.LARGE_INPUT, "2", 10000));
    }

    public static long calculate(String input, String part, int rounds) {

        long res = 1;


        initMonkeys(input);
        BigInteger factor = factor();
        for (int i = 0; i < rounds; i++) {
            for (MonkeyPar2 monkey : monkeys) {
                for (BigInteger worryLevel : monkey.worryLevels) {

                    if (part.equals("1")) {
                        partOne(monkey, worryLevel);
                    } else {
                        partTwo(monkey, worryLevel, factor);
                    }

                    monkey.totalInspected++;
                }
                monkey.worryLevels = new ArrayList<>();
            }
        }

        for (MonkeyPar2 mo : monkeys) {
            pq.offer(mo);
        }

        int i = 0;

        while (i < 2) {
            res = res * pq.poll().totalInspected;
            i++;
        }
        return res;
    }

    private static BigInteger factor() {
        BigInteger factor = BigInteger.ONE;
        for (MonkeyPar2 monkeyPar2 : monkeys) {
            factor = factor.multiply(monkeyPar2.divisibleBy);
        }
        return factor;
    }

    private static BigInteger performOperation(BigInteger operand, String operator,
                                               BigInteger num) {
        if (operator.equals("*")) {
            return operand.multiply(num);
        }

        if (operator.equals("/")) {
            return num.divide(operand);
        }
        if (operator.equals("+")) {
            return num.add(operand);
        }
        if (operator.equals("-")) {
            return num.subtract(operand);
        }

        return BigInteger.ZERO;
    }

    private static void partOne(MonkeyPar2 monkey, BigInteger worryLevel) {
        BigInteger operand = monkey.useOldOperand ? worryLevel : monkey.operand;
        BigInteger newVal = performOperation(operand, monkey.operation, worryLevel);
        newVal = newVal.divide(BigInteger.valueOf(3));
        if (newVal.mod(monkey.divisibleBy).equals(BigInteger.ZERO)) {
            monkeys.get(monkey.trueThrowTo).worryLevels.add(newVal);
        } else {
            monkeys.get(monkey.falseThrowTo).worryLevels.add(newVal);
        }
    }

    private static void partTwo(MonkeyPar2 monkey, BigInteger worryLevel, BigInteger factor) {
        BigInteger operand = monkey.useOldOperand ? worryLevel : monkey.operand;
        BigInteger newVal = performOperation(operand, monkey.operation, worryLevel);
        if (newVal.mod(monkey.divisibleBy).equals(BigInteger.ZERO)) {
            monkeys.get(monkey.trueThrowTo).worryLevels.add(newVal.mod(factor));
        } else {
            monkeys.get(monkey.falseThrowTo).worryLevels.add(newVal.mod(factor));
        }
    }

    private static void initMonkeys(String input) {

        String[] allRows = input.split("\n");
        int j = 0;
        for (int i = 0; i < allRows.length; i++) {
            String row = allRows[i].trim();
            if (row.startsWith("Monkey")) {
                j = i + 1;
                row = allRows[j].trim();
                MonkeyPar2 monkey = new MonkeyPar2();
                monkey.monkeyId = 0;
                String itemsStr = row.trim().replace("Starting items: ", "");
                String[] items = itemsStr.trim().split(", ");
                for (String item : items) {
                    monkey.worryLevels.add(new BigInteger(item));
                }
                j = j + 1;
                row = allRows[j].trim();
                String operatorOperand = row.trim().replace("Operation: new = old ", "");
                String[] oo = operatorOperand.split(" ");
                monkey.operation = oo[0];
                if (oo[1].equals("old")) {
                    monkey.useOldOperand = true;
                } else {
                    monkey.operand = new BigInteger(oo[1]);
                }

                j = j + 1;
                row = allRows[j].trim();
                String divisibleBy = row.trim().replace("Test: divisible by ", "");
                monkey.divisibleBy = new BigInteger(divisibleBy);

                j = j + 1;
                row = allRows[j].trim();
                String trueThorwTo = row.trim().replace("If true: throw to monkey ", "");
                monkey.trueThrowTo = Integer.parseInt(trueThorwTo);

                j = j + 1;
                row = allRows[j].trim();
                String falseThorwTo = row.trim().replace("If false: throw to monkey ", "");
                monkey.falseThrowTo = Integer.parseInt(falseThorwTo);
                monkeys.add(monkey);
            }
            i = j + 1;
        }
    }

}


class MonkeyPar2 {
    int monkeyId;
    long totalInspected;

    String operation;
    BigInteger operand;
    boolean useOldOperand;
    BigInteger divisibleBy;
    int trueThrowTo;
    int falseThrowTo;
    List<BigInteger> worryLevels = new ArrayList<>();
}
