public class Account{
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
        checkBalance();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
        checkBalance();
    }
    private void checkBalance(){
        if(balance < 0){
            balance = 0;
            throw new ArithmeticException("Insufficient Balance!");
        }
    }
    public String toString(){
        return String.format("Account[name=%s, balance=%.2f]", name, balance);
    }
}