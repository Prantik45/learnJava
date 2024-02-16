package task1;

interface Vehicle {
    void drive();
    void stop();
}

class Car implements Vehicle {
    int wheels, passengers;
    String model;

    Car(int wheels, int passengers, String model) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.model = model;
    }

    public void setWheels(int x) {
        this.wheels = x;
    }
    public void setPassengers(int x) {
        this.passengers = x;
    }
    public void setModel(String y) {
        this.model = y;
    }

    public int getWheels() {
        return wheels;
    }
    public int getPassengers() {
        return passengers;
    }
    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println("Driving!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping!");
    }
}

class Auto implements Vehicle {
    int wheels, passengers;
    String model;

    Auto(int wheels, int passengers, String model) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.model = model;
    }

    public Auto() {

    }

    public void setWheels(int x) {
        this.wheels = x;
    }
    public void setPassengers(int x) {
        this.passengers = x;
    }
    public void setModel(String y) {
        this.model = y;
    }

    public int getWheels() {
        return wheels;
    }
    public int getPassengers() {
        return passengers;
    }
    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println("Driving!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping!");
    }
}

class Bike implements Vehicle {
    int wheels, passengers;
    String model;

    Bike(int wheels, int passengers, String model) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.model = model;
    }

    public Bike() {

    }

    public void setWheels(int x) {
        this.wheels = x;
    }
    public void setPassengers(int x) {
        this.passengers = x;
    }
    public void setModel(String y) {
        this.model = y;
    }

    public int getWheels() {
        return wheels;
    }
    public int getPassengers() {
        return passengers;
    }
    public String getModel() {
        return model;
    }

    @Override
    public void drive() {
        System.out.println("Driving!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping!");
    }
}



public class TestInterface {
    public static void main(String[] args) {

        Car c1 = new Car(4, 4, "Skoda");
        Bike b1 = new Bike();
        Auto a1 = new Auto();

        b1.setWheels(2);
        b1.setPassengers(1);
        b1.setModel("Honda");

        a1.setWheels(3);
        a1.setPassengers(3);
        a1.setModel("Piaggio");

        System.out.println("Car Instance");
        System.out.println(c1.getWheels());
        System.out.println(c1.getPassengers());
        System.out.println(c1.getModel());

        System.out.println("Bike Instance");
        System.out.println(b1.getWheels());
        System.out.println(b1.getPassengers());
        System.out.println(b1.getModel());

        System.out.println("Auto Instance");
        System.out.println(a1.getWheels());
        System.out.println(a1.getPassengers());
        System.out.println(a1.getModel());

        c1.drive();
        c1.stop();

        b1.drive();
        b1.stop();

        a1.drive();
        a1.stop();
    }
}
