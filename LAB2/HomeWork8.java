import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        x=input.nextInt();
        System.out.println("Square = "+(x*x));
        System.out.println("Cube = "+(x*x*x));
        System.out.println("Fourth Power = "+(x*x*x*x));
    }
}
