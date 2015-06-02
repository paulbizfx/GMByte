package Lesson13;

public class task1_2 {
    public static void main(String[] args) {
        do_while();
        System.out.println();
        _for();
    }

    private static void _for() {
        for (int i = 100; i >= 0; i = i - 2) {
            System.out.print(i + " ");
        }
    }

    private static void do_while() {
        byte a = 100;
        do {
            System.out.print(a + " ");
            a = (byte) (a - 2);
        } while (a >= 0);
    }
}
