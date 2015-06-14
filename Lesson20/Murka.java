package Lesson20;

public class Murka extends Cat{
    public static void main(String[] args) {
        Murka murka = new Murka();
        murka.age = 2;
        murka.weight = 3;
        murka.eat();
        murka.myau();
        System.out.println(murka.age);
        System.out.println(murka.weight);
        System.out.println(murka.eyes);
    }

    @Override
    void myau() {
        System.out.println("Мяу");
    }

    @Override
    void eat() {
        super.eaat();
    }
}
