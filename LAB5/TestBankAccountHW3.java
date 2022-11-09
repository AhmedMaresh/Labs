public class TestBankAccountHW3 {
    public static void main(String[] args) {
        BankAccountHW4 b=new BankAccountHW4();
        b.deposit(1000);
        b.withdraw(500);
        b.withdraw(400);
        System.out.println(b.getBalance());
        b.addInterest(50);
        System.out.println(b.getBalance());
    }
}
