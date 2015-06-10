package Lesson16;

public class task1 {
    public static void main(String[] args) {

        one(20);
        System.out.println();
        two(20);
        System.out.println();
        three(20);
    }

    private static void three(int a) {
        int[] three = new int[a + 1];
        for (int i = 0; i < three.length; i = i + 2) {
            three[i] = i;
            System.out.print(three[i] + " ");
        }
    }

    private static void two(int a) {
        int b = a + 1;
        int[] two = new int[b];
        for (int i = 0; i < b; i++) {
            two[i] = b - (i+1);
            System.out.print(two[i] + " ");
        }
    }

    private static void one(int a) {
        int[] one = new int[a + 1];
        int i = 0;
        while (i != one.length) {
            one[i] = i;
            System.out.print(one[i] + " ");
            i++;
        }
    }
}
