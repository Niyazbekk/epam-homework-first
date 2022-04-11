// класс человек
class Person {

    private String name;
    private String surname;
    private int age;


    public String getName() { return name; }

    public Person(String name , String surname , int age){

        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public void display(){

        System.out.printf("Person %s \n", name);
    }
}