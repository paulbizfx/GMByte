package Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("What is your second name?");
        String sName = reader.readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.readLine());
        System.out.println(sName + " | " + name + " | " + age + " year");
    }
}
