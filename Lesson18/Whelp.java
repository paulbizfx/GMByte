package Lesson18;

public class Whelp extends Dog {
    public static void main(String[] args) {
        Whelp whelp = new Whelp();
        whelp.golos();
        whelp.down();
        whelp.sit();
        whelp.age = 1;

        System.out.println(whelp.age);
        System.out.println(whelp.weight);
        System.out.println(whelp.dlina);
        System.out.println(whelp.height);
    }

    @Override
    void golos() {
        System.out.println("Тявкаю");
    }

    int dlina = 1;




}

