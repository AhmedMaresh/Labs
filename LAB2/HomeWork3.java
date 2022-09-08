import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        double len;
        double wid;
        Scanner in=new Scanner(System.in);
        System.out.println("Type The Length : ");
        len=in.nextInt();
        System.out.println("Type The Width : ");
        wid=in.nextInt();
        System.out.println("The Area of Rectangle is : "+(len*wid));
        System.out.println("The Perimeter of Rectangle is : "+(2*len*wid));
    }
}
