package LAB2;

public class Question2 {
    public static int[] backUp(int[] a){
        int[] backUpArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            backUpArray[i] = a[i];
        }
        return backUpArray;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4};
        int [] backUp = backUp(arr);

        System.out.println("Baked Up Array : ");
        for (int k:backUp) {
            System.out.println(k);
        }
    }
}
