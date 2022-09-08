import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int x;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        x=input.nextInt();
        if (x>0)
            System.out.println("The Number is Positive.");
        if (x<0)
            System.out.println("The Number us Negative.");
        if (x==0)
            System.out.println("The Number is Zero.");
    }
}
