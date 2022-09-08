import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter X Value : ");
        x=input.nextInt();
        System.out.println("Enter Y Value : ");
        y=input.nextInt();
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Swapping");
        z=x;
        x=y;
        y=z;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
