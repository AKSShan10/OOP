package Polymorphism;

public class VideoGameMain {
    public static void main(String[] args) {
        VideoGame game  = new VideoGame();
        MortalKombat kombat = new MortalKombat();
        GodOfWar war = new GodOfWar();

        game.requirements();
        kombat.requirements();
        war.requirements();
    }
}
