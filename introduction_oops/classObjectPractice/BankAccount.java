package introduction_oops.classObjectPractice;

public class BankAccount {
    private String name;
    private double balance;

    // constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name

    public String getName() {
        return name;
    }

    // Method to get the balance

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String withdrawal(double amount) {

        if (amount <= balance) {

            balance -= amount;

            return "Dear Customer,\n"
                    + "From your A/C No. xx5454 Rs. " + amount + " has been debited.\n"
                    + "Available Balance: Rs. " + balance;

        } else {

            return "Insufficient Balance!";
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Basak", 10000);

        account.deposit(2000);

        System.out.println(account.withdrawal(3000));

        System.out.println("\n Current Balance Rs. " + account.getBalance());
    }

}
