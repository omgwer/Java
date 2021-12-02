package Lesson4;

public class BankAccount
{
    int id;
    String name = "ded";
    double balance;
}

class BankAccountTest
{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount MissAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Alex";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
       // YourAccount.name = "Efim";
        YourAccount.balance = 44.44;

        MissAccount.id = 3;
        MissAccount.name = "Biba";
        MissAccount.balance = 0.005;

        System.out.print(YourAccount.name);
    }
}
