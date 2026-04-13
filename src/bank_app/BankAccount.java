package bank_app;

public class BankAccount {
    String ownerName;
    double balance = 0.0;
    String accountNumber;

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Счет пополнен на: " + amount);
        } else {
            System.out.println("Ошибка: сумма пополнения должна быть положительной");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Ошибка: Сумма снятия должна быть положительной");
        } else if (amount > balance) {
            System.out.println("❌ Ошибка: Недостаточно средств на счете");
        } else {
            balance = balance - amount;
            System.out.println("✅ Со счёта снято: " + amount);
        }
    }

    public boolean isVip() {
        if (balance >= 10_000) {
            return true;
        } else {
            return false;
        }
    }

    public void printAccountInfo() {
        System.out.println("Владелец: " + ownerName +
                "\nНомер счета: " + accountNumber +
                "\nБаланс: " + balance + " руб." +
                "\nVIP статус: " + (isVip() ? "да" : "нет") + "\n");
    }

} // ← ЭТА СКОБКА ЗАКРЫВАЕТ КЛАСС. ВСЁ, ЧТО ВЫШЕ — ВНУТРИ КЛАССА.

