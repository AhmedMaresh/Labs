package LAB1;

public class Question3 {
    public static void main(String[] args) {
        int[] x = {10 , 11 , 12};
        int[] y = {13 , 14};
        int[] z = new int[5];

        System.arraycopy(x , 0 , z , 0 , x.length);
        System.arraycopy(y , 0 , z ,3 , y.length);
        for (int i:z) {
            System.out.println(i);
        }
    }
}
