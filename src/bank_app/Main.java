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

/*
В классе Main:
Создай два банковских счёта:
Счёт 1:
Владелец: "Иван Петров"
Номер: "40817810099910004312"
Пополни на 5000
Сними 1500
Выведи информацию

Счёт 2:
Владелец: "Мария Сидорова"
Номер: "40817810099920005423"
Пополни на 15000
Попробуй снять 20000 (должна быть ошибка)
Выведи информацию
*/
