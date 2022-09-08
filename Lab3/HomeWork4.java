import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        x=input.nextInt();
        if (x<=9)
            System.out.println("It Has 1 Integer.");
        if (x<=99&&x>=10)
            System.out.println("It Has 2 Integers.");
        if (x<=999&&x>=100)
            System.out.println("It Has 3 Integers.");
        if (x<=9999&&x>=1000)
            System.out.println("It Has 4 Integers.");
        if (x<=99999&&x>=10000)
            System.out.println("It Has 5 Integers.");
        if (x<=999999&&x>=100000)
            System.out.println("It Has 6 Integers.");
        if (x<=9999999&&x>=1000000)
            System.out.println("It Has 7 Integers.");
        if (x<=99999999&&x>=10000000)
            System.out.println("It Has 8 Integers.");
        if (x<=999999999&&x>=100000000)
            System.out.println("It Has 9 Integers.");
    }
}
