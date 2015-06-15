package Lesson30;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Integer a = Integer.parseInt(s);
        String znak = scanner.next();
        String s1 = scanner.next();
        Integer b = Integer.parseInt(s1);
        switch (znak) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Неправильный знак");
                break;
        }
    }
}
