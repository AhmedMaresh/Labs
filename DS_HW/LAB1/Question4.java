package LAB1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x , y;
        System.out.println("Enter Arrays Size  : ");
        x=input.nextInt();
        y=input.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        boolean check = true;
        System.out.println("Enter Array 1 Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i]=input.nextInt();
        }
        System.out.println("Enter Array 2 Elements : ");
        for (int i = 0; i < b.length; i++) {
            b[i]=input.nextInt();
        }
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) check = false;
            }
        }
        else check = false;
        if (check == true)
            System.out.println("The Arrays are Equal.");
        else
            System.out.println("The Arrays aren't Equal.");
    }
}
