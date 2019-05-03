public class Account {
    private String owner;
    private int balance = 0;

    public Account(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public Account(){

    }

    public int getBalance(){
        return this.balance;
    }

    public String getOwner(){
        return this.owner;
    }

    public void addMoney(int money) {
        balance += money;
    }

    public void withdrawal(int money) {
        if(money > balance){
            throw new IllegalArgumentException();
        }
        balance -= money;
    }

    public void transfer(Account owner, int money){
        this.withdrawal(money);
        owner.addMoney(money);
    }
}
