public class task1 {

        public static void main(String[] args) {

            Person tom = new Person("Tom" , "Bob" , 22);
            tom.display();
            Person sam = new Employee("Sam", "Sam" , 22 , "Oracle" , 3000 , "Manager");
            sam.display();
            Person bob = new Client("Bob", "Bob", 30 , "DeutscheBank" , 3000 , "CreditAccount");
            bob.display();
        }
    }

