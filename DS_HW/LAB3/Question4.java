package LAB3;

public class Question4 {
    public static boolean isEqual(int[] x , int[] y){
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] x = {1 , 2 , 3};
        int[] y = {1 , 2 , 4};

        if (isEqual(x , y))
            System.out.println("The Arrays are Equal.");
        else
            System.out.println("The Arrays aren't Equal.");
    }
}
