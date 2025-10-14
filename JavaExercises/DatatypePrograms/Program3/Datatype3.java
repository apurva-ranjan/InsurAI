// User-defined class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class UserDefinedExample {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", 30);  // Creating object of custom class
        p1.display();
    }
}
