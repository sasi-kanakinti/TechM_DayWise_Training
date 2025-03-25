import java.util.*;

class Vehicle {

    Scanner sc=new Scanner(System.in);
    private double speed;
    private String fuelType;

    public Vehicle(double speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }
    public void displayDetails() {
        System.out.println("Speed: " + speed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    
    private int numDoors;

    public Car(double speed, String fuelType, int numDoors) {
        super(speed, fuelType);
        this.numDoors = numDoors;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Doors: " + numDoors);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar(double speed, String fuelType, int numDoors, int batteryCapacity) {
        super(speed, fuelType, numDoors);
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double speed=sc.nextDouble();
        String fuelType=sc.next();
        int numDoors=sc.nextInt();
        int batteryCapacity=sc.nextInt();
        ElectricCar electricCar = new ElectricCar(speed, fuelType, numDoors, batteryCapacity);
        electricCar.displayDetails();
        sc.close();
    }
}