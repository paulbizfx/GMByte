package Lesson6;

public class task1 {
    public static void main(String[] args) {
        Bird sokol = new Bird();
        System.out.println("Мой вес: " + sokol.weight);
        System.out.println("Мой размах крыльев: " + sokol.razmah);
        System.out.println("Моя максимальная скорость полёта: " + sokol.speed);
        System.out.println("Моя максимальная высота полёта: " + sokol.height);

        Bird.fly();
        Bird.go();
        Bird.eat();
        Bird.eggs();
    }



    public static class Bird {

        byte weight = 3;
        byte razmah = 1;
        byte speed = 100;
        int height = 1000;

        static void fly() {
            System.out.println("Я умею летать");
        }

        static void go() {
            System.out.println("Я умею ходить");
        }

        static void eat() {
            System.out.println("Я умею есть");
        }

        static void eggs() {
            System.out.println("Я умею откладывать яйца");
        }
    }
}
