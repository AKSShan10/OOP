package Interface;

public interface Animal {
    // An interface cannot contain a constructor (as it cannot be used to create objects)
//    public Animal() {
//
//    }

    // All variables and methods in an interface are declared as public
    public void animalSound(); // interface method (does not have a body)
    public void sleep();

    // We cannot use traditional methods in an interface as interface methods cannot have body
//    public void display() {
//        System.out.println("I am in an interface");
//    }

    // But We can use traditional variable in an interface
    public final String note = "An interface can contain variables";
}
