package Person;

public class Main {
    public static void main(String args[]) {
        Person person1 = new Person("Clement Olives", 26, "Accra New Town, GT, Ghana");
        Person person2 = new Person("Daniel Muray", 21, "Kasoa, C/R, Ghana");
        
        System.out.println("Person 1's name is " + person1.getName());
        System.out.println("Person 1's age is " + person1.getAge());
        System.out.println("Person 1's address is " + person1.getAddress());

        System.out.println("Person 2's name is " + person2.getName());
        System.out.println("Person 2's age is " + person2.getAge());
        System.out.println("Person 2's address is " + person2.getAddress());

        person1.setAddress("789 Oyibi St.");
        System.out.println("Person 1's new address is " + person1.getAddress());
    }
   


}
