class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car("Honda", 2022);

        // Display car information
        myCar.displayInfo();
    }
}
