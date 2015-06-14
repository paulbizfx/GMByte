package Lesson21;

public class Rat_polimorf implements Mouse {
    public static void main(String[] args) {
        Mouse mouse = new Rat_polimorf();
        mouse.cheese();
        mouse.Piu();
    }
    @Override
    public void cheese() {
        System.out.println("Полиморфический сыр");
    }

    @Override
    public void Piu() {
        System.out.println("Полиморфический Пиу-Пиу");
    }
}
