package Inheritance;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }

    public void fetch() {
        System.out.println(name + " is fetching");
    }
}
