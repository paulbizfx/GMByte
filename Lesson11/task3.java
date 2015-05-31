package Lesson11;

public class task3 {
    public static void main(String[] args) {
        byte a = 111;
        if (a < 100) {
            if ((a < 100) && (a > 50)) {            //проверка на меньше 100 и больше 50
                System.out.println("a < 100");
                System.out.println("a > 50");
            } else {                                //меньше 100
                System.out.println("a < 100");
            }
        } else {                                    //больше 50
            System.out.println("a > 50");
        }
    }
}
