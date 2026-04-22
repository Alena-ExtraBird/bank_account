package bank_app;

public class Main {
    public static void main(String[] args) {
        BankAccount score1 = new BankAccount("Мария Владимировна", "555660042452356");


        score1.deposit(1000);
        score1.withdraw(500);

        score1.printAccountInfo();

        BankAccount score2 = new BankAccount("Владимир Пупкин", "3534436446387543");

        score2.deposit(100_000);
        score2.withdraw(10_000);

        score2.printAccountInfo();

        score2.transfer(score1, 50_000);
        score1.printAccountInfo();
        score2.printAccountInfo();
    }
}

