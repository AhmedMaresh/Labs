public class savingAccountHW6 {
    private double balance;

    private double rate;

    public savingAccountHW6(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double addInterest(){
        balance=balance+(balance*(rate/100));
        return balance;
    }
}
