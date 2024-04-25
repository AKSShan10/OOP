package Abstraction;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Motorcycle();

        // car.printMsg(); // We cannot access this method since the ref. is of Vehicle
        // So, How to access that method ? => By casting it
        ((Car) car).printMsg();

        Car car1 = new Car();
        car1.startEngine();
        car1.printMsg(); // Now we can access this method as the ref. is of Car

        // Always remember that "reference type determines access"

        car.startEngine();
        car.accelerate(80);
        car.brake();
        car.stopEngine();

        bike.startEngine();
        bike.accelerate(100);
        bike.brake();
        bike.stopEngine();
    }
}
