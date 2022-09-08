import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        float x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 Numbers : ");
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        System.out.println("The Average is "+(x+y+z)/3);
    }
}
