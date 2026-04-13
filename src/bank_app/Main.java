package bank_app;

public class Main {
    public static void main(String[] args) {
        BankAccount score1 = new BankAccount();
        score1.setOwnerName("Иван Петров");
        score1.setAccountNumber("40817810099910004312");

        score1.deposit(5000);
        score1.withdraw(1500);

        score1.printAccountInfo();

        BankAccount score2 = new BankAccount();
        score2.setOwnerName("Мария Владимировна");
        score2.setAccountNumber("4085746099910004313");

        score2.deposit(100_000);
        score2.withdraw(10_000);

        score2.printAccountInfo();

    }
}

