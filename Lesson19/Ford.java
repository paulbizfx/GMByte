package Lesson19;

public class Ford extends Car {
    public static void main(String[] args) {
        Ford ford = new Ford();
        ford.maxSpeed = 190;
        ford.sec = 4;
        ford.on();
        ford.secTo100();
        System.out.println(ford.maxSpeed);
        System.out.println(ford.power);
        System.out.println(ford.speed);
        ford.crash();
        System.out.println(ford.door);
    }

    void crash() {
        System.out.println("Я сломался T_T");
    }

    int door = 4;
}
