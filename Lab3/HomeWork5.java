import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        if (x==y&&y==z)
            System.out.println("All The Same.");
        if (x!=y&&y!=z)
            System.out.println("All Different.");
        if (x==y&&x!=z)
            System.out.println("First Number = Second Number But Not Third Number.");
        if (x==z&&x!=y)
            System.out.println("First Number = Third Number But Not Second Number.");
        if (y==z&&y!=x)
            System.out.println("Second Number = Third Number But Not First Number.");
    }
}
