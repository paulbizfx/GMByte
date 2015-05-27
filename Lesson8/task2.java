package Lesson8;

public class task2 {
    public static void main(String[] args) {
        System.out.println(method((byte) 40));

    }

    static byte method(byte a) {
        System.out.println("В качестве аргументов мне передали " + a);
        return (byte) (a + 5);
    }

}
