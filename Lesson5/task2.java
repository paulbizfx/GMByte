package Lesson5;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Ого, метод Method1 что-то вернул! Он вернул число " + Method1());

        byte a = Method1();
        byte b = Method2();
        byte c = (byte) (a + b);
        System.out.println("Числа из методов сложились и получилось " + c);

    }

    static byte Method1() {
        byte a = 3;
        byte b = 5;
        return (byte) (a + b);
    }

    static byte Method2() {
        byte a = 1;
        byte b = 22;
        return (byte) (a + b);
    }
}
