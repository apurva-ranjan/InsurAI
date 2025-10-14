class Car {
    String brand;
    int year;

    // Default constructor
    Car() {
        brand = "Unknown";
        year = 0;
        System.out.println("Default constructor called");
    }

    // Non-parameterized constructor with some custom logic
    Car(String defaultBrand) {
        brand = defaultBrand;
        year = 2020;  // default year
        System.out.println("Non-parameterized constructor called");
    }

    // Parameterized constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Car c1 = new Car();
        c1.display();

        // Using non-parameterized constructor
        Car c2 = new Car("Toyota");
        c2.display();

        // Using parameterized constructor
        Car c3 = new Car("Honda", 2022);
        c3.display();
    }
}
