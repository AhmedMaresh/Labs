import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Month : ");
        x=input.nextInt();
        System.out.println("Enter The Day : ");
        y=input.nextInt();
        if (x<=3&&x>=1)
            System.out.println("Winter.");
        else if (x<=6&&x>=4)
            System.out.println("Spring.");
        else if (x<=9&&x>=7)
            System.out.println("Summer.");
        else if (x<=12&&x>=10)
            System.out.println("Fall.");
        if (x%3==0&&y>=21)
        {
            if (x<=1&&x>=3&&y>=21)
                System.out.println("Spring.");
            else if (x<=6&&x>=4&&y>=21)
                System.out.println("Summer.");
            else if (x<=9&&x>=7&&y>=21)
                System.out.println("Fall.");
            else if (x<=12&&x>=10&&y>=21)
                System.out.println("Winter.");
        }
    }
}
