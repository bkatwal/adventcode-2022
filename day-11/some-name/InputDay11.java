public final class InputDay11 {

    public static final String SMALL_INPUT = "Monkey 0:\n" +
            "  Starting items: 79, 98\n" +
            "  Operation: new = old * 19\n" +
            "  Test: divisible by 23\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 1:\n" +
            "  Starting items: 54, 65, 75, 74\n" +
            "  Operation: new = old + 6\n" +
            "  Test: divisible by 19\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 0\n" +
            "\n" +
            "Monkey 2:\n" +
            "  Starting items: 79, 60, 97\n" +
            "  Operation: new = old * old\n" +
            "  Test: divisible by 13\n" +
            "    If true: throw to monkey 1\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 3:\n" +
            "  Starting items: 74\n" +
            "  Operation: new = old + 3\n" +
            "  Test: divisible by 17\n" +
            "    If true: throw to monkey 0\n" +
            "    If false: throw to monkey 1";


    public static final String LARGE_INPUT =
            "Monkey 0:\n" +
                    "  Starting items: 66, 59, 64, 51\n" +
                    "  Operation: new = old * 3\n" +
                    "  Test: divisible by 2\n" +
                    "    If true: throw to monkey 1\n" +
                    "    If false: throw to monkey 4\n" +
                    "\n" +
                    "Monkey 1:\n" +
                    "  Starting items: 67, 61\n" +
                    "  Operation: new = old * 19\n" +
                    "  Test: divisible by 7\n" +
                    "    If true: throw to monkey 3\n" +
                    "    If false: throw to monkey 5\n" +
                    "\n" +
                    "Monkey 2:\n" +
                    "  Starting items: 86, 93, 80, 70, 71, 81, 56\n" +
                    "  Operation: new = old + 2\n" +
                    "  Test: divisible by 11\n" +
                    "    If true: throw to monkey 4\n" +
                    "    If false: throw to monkey 0\n" +
                    "\n" +
                    "Monkey 3:\n" +
                    "  Starting items: 94\n" +
                    "  Operation: new = old * old\n" +
                    "  Test: divisible by 19\n" +
                    "    If true: throw to monkey 7\n" +
                    "    If false: throw to monkey 6\n" +
                    "\n" +
                    "Monkey 4:\n" +
                    "  Starting items: 71, 92, 64\n" +
                    "  Operation: new = old + 8\n" +
                    "  Test: divisible by 3\n" +
                    "    If true: throw to monkey 5\n" +
                    "    If false: throw to monkey 1\n" +
                    "\n" +
                    "Monkey 5:\n" +
                    "  Starting items: 58, 81, 92, 75, 56\n" +
                    "  Operation: new = old + 6\n" +
                    "  Test: divisible by 5\n" +
                    "    If true: throw to monkey 3\n" +
                    "    If false: throw to monkey 6\n" +
                    "\n" +
                    "Monkey 6:\n" +
                    "  Starting items: 82, 98, 77, 94, 86, 81\n" +
                    "  Operation: new = old + 7\n" +
                    "  Test: divisible by 17\n" +
                    "    If true: throw to monkey 7\n" +
                    "    If false: throw to monkey 2\n" +
                    "\n" +
                    "Monkey 7:\n" +
                    "  Starting items: 54, 95, 70, 93, 88, 93, 63, 50\n" +
                    "  Operation: new = old + 4\n" +
                    "  Test: divisible by 13\n" +
                    "    If true: throw to monkey 2\n" +
                    "    If false: throw to monkey 0";
}
