package Polymorphism;

public class VideoGame {
    protected String title;

    public VideoGame() {
        System.out.println("Default Constructor");
    }

    public VideoGame(String title) {
        this.title = title;
    }

    public void requirements() {
        System.out.println("Each game will have different specifications!");
    }
}
