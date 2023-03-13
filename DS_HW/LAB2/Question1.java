package LAB2;

public class Question1 {
    public static int[] reverse(int[] x){
        int[] y = new int[x.length];
        int count = 0;
        for (int i = x.length-1; i >= 0 ; i--) {
            y[i] = x[count];
            count++;
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = y[i];
        }
        return x;
    }

    public static void main(String[] args) {
        int[] x={1 , 2 , 3 , 4 , 5};

        System.out.println("Array Elements : ");
        for (int j:x) {
            System.out.println(j);
        }
        reverse(x);
        System.out.println("The Reversed Array :");
        for (int k:x) {
            System.out.println(k);
        }
    }
}
