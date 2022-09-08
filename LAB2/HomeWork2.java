import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        double rad;
        Scanner in=new Scanner(System.in);
        System.out.println("Type The Radius : ");
        rad=in.nextInt();
        System.out.println("The Area of The Circle is : "+(3.14*rad));
        System.out.println("The Perimeter of The Circle is : "+(2*3.14*rad));
    }
}
