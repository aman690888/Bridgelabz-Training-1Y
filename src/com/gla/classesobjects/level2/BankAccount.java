public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.accountHolder = "Aman";
        acc.accountNumber = 1001;
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(1500);

        acc.displayBalance();
    }
}