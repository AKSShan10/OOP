package Interface;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.animalSound();
        ((Pig)animal).display();
        
        Pig myPig = new Pig();  // Created a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.display();
    }
}
