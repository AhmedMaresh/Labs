package LAB3;

public class Question3 {
    public static void main(String[] args) {
        int[] x={1 , 2 , 3};
        int[] y={9 , 8 , 7};
        int[] z = new int[x.length+y.length];
        int flag = 0;
        for (int i = 0; i < z.length; i++) {
            if (i >= x.length){
                z[i] = y[flag];
                flag++;
            }
            else{
                z[i] = x[i];
            }
        }
        for (int j:z) {
            System.out.println(j);
        }
    }
}
