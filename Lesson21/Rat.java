package Lesson21;

public class Rat implements Mouse {
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.cheese();
        rat.Piu();
    }


    @Override
    public void cheese() {
        System.out.println("Я съела сыр =)");
    }

    @Override
    public void Piu() {
        System.out.println("Пиу-Пиу");
    }

}
