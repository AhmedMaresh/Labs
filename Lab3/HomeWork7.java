import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        if (x<y&&y<=z)
            System.out.println("In Order.");
        else if (x>y&&y>z)
            System.out.println("In Order.");
        else
            System.out.println("Not In Order.");
    }
}
