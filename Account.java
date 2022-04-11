public class Account extends Client {

    String accNo;
    long balance;


    public Account(String name, String surname, int age, String bank, int salary, String accType) {
        super(name, surname, age, bank, salary, accType);
    }

    public void pay(int costOfGoods) {
        if (costOfGoods <= balance) {
            System.out.println("You payed for the goods: " + costOfGoods + "$");
            balance = -costOfGoods;
            System.out.println("Account balance is " + balance);
        }
    }

    public void addMoney(int pocketMoney) {
        System.out.println("You paid " + pocketMoney + " for your credit");
        balance += pocketMoney;
        System.out.println("Account balance is " + balance);
    }
}
