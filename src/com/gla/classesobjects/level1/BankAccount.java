public class BankAccount {

    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.accountHolder = "Aman";
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(1500);

        acc.display();
    }
}