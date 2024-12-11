package objOriented;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {

        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + balance);
        } else { balance -= amount;
        }
    }
}
