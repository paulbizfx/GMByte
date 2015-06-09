package Lesson14.Task2;

public class Home {
    private byte lenght = 0;
    private byte width = 0;

    public byte getLenght() {
        if (lenght < 20) {
            System.out.println("Сначала измените значение переменной");
        } else {
            return lenght;
        }
        return 0;
    }



    public void setLenght(byte lenght) {
        this.lenght = lenght;
    }

    public byte getWidth() {
        if (width < 20) {
            System.out.println("Сначала измените значение переменной");
        } else {
            return width;
        }
        return 0;
    }

    public void setWidth(byte width) {
        this.width = width;
    }
}
