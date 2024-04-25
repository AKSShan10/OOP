package Encapsulation;

public class BankMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1214 2204 9345", 10000.0);
        account.deposit(2000.0);
        System.out.println(account.getBalance());

        account.withdraw(1000.0);
        System.out.println(account.getBalance());
    }
}
