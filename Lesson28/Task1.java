package Lesson28;

public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        int[][][] arr = new int[a][b][c];

        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][1][0] = 3;
        arr[0][1][1] = 4;
        arr[1][0][0] = 5;
        arr[1][0][1] = 6;
        arr[1][1][0] = 7;
        arr[1][1][1] = 8;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[i][k][j]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
        System.out.println();


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[j][i][k]);
                }
            }
        }
        System.out.println();


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[j][k][i]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[k][i][j]);
                }
            }
        }
        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(arr[k][j][i]);
                }
            }
        }
    }
}
