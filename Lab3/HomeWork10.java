import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
       int x;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Month : ");
        x=input.nextInt();
        if (x==1)
            System.out.println("January Has 31 Days.");
        else  if (x==2)
            System.out.println("February Has 28 Days.");
        else if (x==3)
            System.out.println("March Has 31 Days.");
        else if (x==4)
            System.out.println("April Has 30 Days.");
        else if (x==5)
            System.out.println("May Has 31 Days.");
        else if (x==6)
            System.out.println("June Has 30 Days.");
        else if (x==7)
            System.out.println("July Has 30 Days.");
        else if (x==8)
            System.out.println("August Has 31 Days.");
        else if (x==9)
            System.out.println("September Has 30 Days.");
        else if (x==10)
            System.out.println("October Has 31 Days.");
        else if (x==11)
            System.out.println("November Has 30 Days.");
        else if (x==12)
            System.out.println("December Has 31 Days.");
        else
            System.out.println("No Month With This Number.");
    }
}
