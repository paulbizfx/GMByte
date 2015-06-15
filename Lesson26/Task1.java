package Lesson26;

public class Task1 {
    public static void main(String[] args) {
        String[][] arr = new String[10][10];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length;j++) {

                if (i >= j) System.out.print(arr[i][j] = "*");
                else System.out.print(arr[i][j] = "");
            }

            System.out.println();
        }
    }
}


