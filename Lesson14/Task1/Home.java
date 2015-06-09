package Lesson14.Task1;

public class Home {
    private byte width = 0;
    private byte length = 0;

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        if (width < 20) {
            System.out.println("Введено неверное значение");
        } else {
            this.width = width;
        }
    }

    public byte getLength() {
        return length;
    }

    public void setLength(byte length) {
        if (length < 20) {
            System.out.println("Введено неверное значение");
        } else {
            this.length = length;
        }
    }
}
