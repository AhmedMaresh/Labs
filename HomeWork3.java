public class HomeWork3 {
    public static void main(String[] args) {
        String x=new String("Mississippi");
        String y;
        y=x.replace('i','!');
        y=y.replace('s','$');
        System.out.println("Actual = Mississippi.");
        System.out.println("Expected = M!$$!$$!pp!.");
        System.out.println(x);
        System.out.println(y);

    }
}
