import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Value of X : ");
        x=in.nextInt();
        System.out.println("Enter the Value of Y : ");
        y=in.nextInt();
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println(x+" * "+y+" = "+(x*y));
        System.out.println("The Average is "+(x+y/2.0));
    }
}
