public class Account {

    private String type;


    private String userName;
    private int balance = 0;

    private int maxDebit = -1000;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String name) {
        this.type = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            System.out.print("Account balance: " + balance +" | Deposit: " + amount );
            balance += amount;
            System.out.println(" | After operation: " + balance);
        }else System.out.println("The deposit/withdrawal amount must be positive!");

    }

    public boolean withdraw(int amount){
        if(amount > 0){
            if(balance - amount > maxDebit){
                System.out.print("Account balance: " + balance +" | Withdrawal: " + amount );
                balance-=amount;
                System.out.println(" | After operation: " + balance);
                return true;
            }else{
                System.out.println("You cannot perform an operation exceeding the debit...");
                return false;
            }
        }else {
            System.out.println("The deposit/withdrawal amount must be positive!");
            return false;
        }
    }

    public void transfer(Account other, int amount){
        if(withdraw(amount)){
            other.balance += amount;
        }
    }

    @Override
    public String toString(){
        return "Account type: " + type +" | User name: " + userName + " | Account balance: " + balance;
    }
}
