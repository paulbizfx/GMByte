package Lesson16;

public class task2 {
    public static void main(String[] args) {
        dog[] dogs = new dog[7];

        for (int i = 0; i < dogs.length; i++) {
            int a = i + 1;
            dogs[i] = new dog();
            dogs[i].height = (byte) a;
            dogs[i].lenght = (byte) a;
            dogs[i].weigth = (byte) a;
            System.out.println("Dog" + a + ": "  +
                    "Height: " + dogs[i].height +
                    " Lenght: " + dogs[i].lenght +
                    " Weigth: " + dogs[i].weigth);
        }


    }

    public static class dog {
        byte weigth = 2;
        byte lenght = 1;
        byte height = 1;
    }
}


