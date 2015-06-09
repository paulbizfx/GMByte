package Lesson15;

public class task1 {
    public static void main(String[] args) {
        New n = new New();
        n.method((byte) 12, 140, (long) 100000);
        n.method((byte) 12, (long) 21, 1);
        n.method(11, (byte) 11, (long) 1000);
        n.method(11, (long) 1000, (byte) 12);
        n.method((long) 122222, 12, (byte) 122);
        n.method((long) 2111111, (byte) 12, 2111);

    }
}
