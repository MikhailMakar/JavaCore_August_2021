package lessons.lesson01102021.synchronized2;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        int x = balance + amount;
        balance = x;
    }

    public synchronized void withdraw(int amount) {
        int x = balance - amount;
        balance = x;
    }
}

class OperatorDeposit extends Thread {
    private Account account;

    public OperatorDeposit(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            account.deposit(100);
        }
    }
}

class OperatorWithdraw extends Thread {
    private Account account;

    public OperatorWithdraw(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5000; i++) {
            account.withdraw(50);
        }
    }
}





