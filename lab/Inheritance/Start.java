package lab.Inheritance;

interface IRentable {
    double calculateRent(int days);
}

abstract class Vehicle {
    protected String plateNo;
    protected String model;

    Vehicle() {}

    Vehicle(String plateNo, String model) {
        this.plateNo = plateNo;
        this.model = model;
    }

    abstract void showInfo();
}

class Car extends Vehicle implements IRentable {
    protected int rentedDays;

    Car() {}

    Car(String plateNo, String model, int rentedDays) {
        super(plateNo, model);
        this.rentedDays = rentedDays;
    }

    public double calculateRent(int days) {
        if (days > 5)
            return days * 1000;
        else
            return days * 700;
    }

    void showInfo() {
        System.out.println("Car: " + model + ", Plate: " + plateNo +
                           ", Days: " + rentedDays);
    }
}

class Bike extends Vehicle {
    protected boolean helmetIncluded;

    Bike() {}

    Bike(String plateNo, String model, boolean helmetIncluded) {
        super(plateNo, model);
        this.helmetIncluded = helmetIncluded;
    }

    void showInfo() {
        System.out.println("Bike: " + model + ", Plate: " + plateNo +
                           ", Helmet: " + helmetIncluded);
    }
}

class Garage {
    protected String name;
    protected Vehicle[] vehicles;
    protected int count = 0;

    Garage() {}

    Garage(String name, int size) {
        this.name = name;
        vehicles = new Vehicle[size];
    }

    void addVehicle(Vehicle v) {
        if (count < vehicles.length)
            vehicles[count++] = v;
    }

    void showVehicles() {
        for (int i = 0; i < count; i++)
            vehicles[i].showInfo();
    }
}

public class Start {
    public static void main(String[] args) {

        Vehicle v1 = new Bike("DHK-1111", "Yamaha", true);
        Vehicle v2 = new Car("CTG-2222", "Toyota", 7);

        Garage g = new Garage("City Garage", 5);

        g.addVehicle(v1);
        g.addVehicle(v2);

        g.showVehicles();

        Car c = (Car) v2;   // type casting
        System.out.println("Rent: " + c.calculateRent(7));
    }
}
