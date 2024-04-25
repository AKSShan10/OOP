package Abstraction;

public class Motorcycle extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("The Motorcycle is accelerating at " + speed + " km/h");
    }

    @Override
    void brake() {
        System.out.println("Motorcycle braking");
    }
}
