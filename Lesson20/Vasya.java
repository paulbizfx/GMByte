package Lesson20;

public class Vasya extends Cat{
    public static void main(String[] args) {
        Cat vasya = new Vasya();
        vasya.eat();
        vasya.myau();
        vasya.age = 4;
        vasya.weight = 5;
        System.out.println(vasya.eyes);
        System.out.println(vasya.age);
        System.out.println(vasya.weight);
    }

    @Override
    void myau() {
        System.out.println("Мяу-мяу");
    }

    @Override
    void eat() {
        super.eaat();
    }
}
