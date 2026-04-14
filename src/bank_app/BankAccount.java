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
            System.out.println("\n✅Счет пополнен на: " + ownerName + " " + amount);
        } else {
            System.out.println("❌Ошибка: сумма пополнения должна быть положительной\n");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("\n❌ Ошибка: Сумма снятия должна быть положительной\n");
        } else if (amount > balance) {
            System.out.println("\n❌ Ошибка: Недостаточно средств на счете\n");
        } else {
            balance = balance - amount;
            System.out.println("\n✅ Со счёта снято: " + ownerName + " " + amount + "\n");
        }
    }

    public boolean isVip() {
        if (balance >= 10_000) {
            return true;
        } else {
            return false;
        }
    }

    public void transfer (BankAccount receiver, double amount) {
        if (amount <= 0) {
            System.out.println("\n❌ Ошибка: Сумма перевода должна быть положительной!\n");
            return;
        }
        if (amount > this.balance) {
            System.out.println("\n❌ Ошибка: Недостаточно средств для перевода!\n");
            return;
        }
        this.withdraw(amount);
        receiver.deposit(amount);

        System.out.println("\n✅ Перевод " + amount + " руб. от " + this.ownerName + " -> " + receiver.ownerName + " выполнен!\n");
    }

    public void printAccountInfo() {
        System.out.println("Владелец: " + ownerName +
                "\nНомер счета: " + accountNumber +
                "\nБаланс: " + balance + " руб." +
                "\nVIP статус: " + (isVip() ? "да" : "нет") + "\n");
    }

}

