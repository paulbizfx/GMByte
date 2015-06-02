package Lesson13;

public class task2_2 {
    public static void main(String[] args) {
        do_while();
        System.out.println();
        _for();
    }

    private static void _for() {
        for (int i = 10; i <= 50; i = i + 3) {
            System.out.print(i + " ");
        }
    }

    private static void do_while() {
        byte a = 10;
        do {
            System.out.print(a + " ");
            a = (byte) (a + 3);
        } while (a <= 50);
    }
}
