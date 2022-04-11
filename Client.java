// класс клиента банка
class Client extends Person{

    private int salary;
    private String bank;
    private String accType;

    public Client(String name , String surname , int age, String bank, int salary , String accType) {

        super(name,surname,age);
        this.bank=bank;
        this.salary=salary;
        this.accType=accType;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSalary(){ return salary; }

    public String getAccType() {
        return accType;
    }
}