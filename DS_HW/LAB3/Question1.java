package LAB3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x =new int[4];
        System.out.println("Enter Integer Array Elements : ");
        for (int i = 0; i < x.length; i++) {
            x[i]=input.nextInt();
        }
        int[] y = new int[5];
        for (int i = 0; i < y.length; i++) {
            y = x.clone();
        }
        System.out.println("The Cloned Array : ");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
