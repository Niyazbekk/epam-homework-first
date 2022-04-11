// служащий некоторой компании
class Employee extends Person{

    private String company;
    private String position;
    private int salary;


    public Employee(String name , String surname , int age, String company , int salary , String position) {

        super(name,surname,age);
        this.company = company;
        this.position=position;
        this.salary=salary;
    }
    public String getCompany(){ return company; }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}