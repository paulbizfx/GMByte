package Lesson14.Task2;


public class task2 {
    public static void main(String[] args) {
        Home home = new Home();

        home.setLenght((byte) 22);
        home.setWidth((byte) 33);

        System.out.println(home.getWidth());
        System.out.println(home.getLenght());
    }
}
