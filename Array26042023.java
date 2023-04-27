package Homework;

public class Array26042023 {

    public static void main(String[] args) {

        int[] ar = new int[20];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            ar[i] = ar[i-2] + ar[i-1];
        }

            for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + "  ");
            }

            System.out.println();

            for (int i = 0; i < ar.length; i++) {
                ar[i] = ar[i] + 10;
                System.out.print(ar[i]  + " ");
        }

    }
}
