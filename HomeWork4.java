import java.awt.*;

public class HomeWork4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("-----------------------------------");
        System.out.println("Expected Location(5,10),W=20,H=30");
        System.out.println("-----------------------------------");
        System.out.println("Actual X = "+box.x);
        System.out.println("Actual Y = "+box.y);
        System.out.println("Actual Width = "+box.getWidth());
        System.out.println("Actual Height = "+box.getHeight());
    }
}
