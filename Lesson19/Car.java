package Lesson19;

public class Car {
    int speed = 120;
    int maxSpeed = 210;
    int power = 100;
    int sec = 2;

    void on() {
        System.out.println("Я завелся");
    }

    void secTo100() {
        System.out.println("Разгоняюсь за " + sec);
    }


}
