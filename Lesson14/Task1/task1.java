package Lesson14.Task1;

public class task1 {
    public static void main(String[] args) {

        Home home = new Home();
        home.setLength((byte) 22);
        home.setWidth((byte) 20);
        System.out.println(home.getLength());
        System.out.println(home.getWidth());
    }
}
