public class saveAccountTesterHW6 {
    public static void main(String[] args) {
        savingAccountHW6 a=new savingAccountHW6(1000,10);
        System.out.println("1100 Expected.");
        System.out.println("-----------------------");
        System.out.println(a.addInterest());
    }
}
