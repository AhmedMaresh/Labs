package LAB1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 Numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=x.nextInt();
        }
        for (int j : arr ) {
            System.out.println(j);
        }
    }
}
