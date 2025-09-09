package facade;

public class DVDPlayer {
	 public void on() {
	        System.out.println("DVD Player is ON.");
	    }
	    public void play() {
	        System.out.println("DVD Player is playing.");
	    }
	    public void off() {
	        System.out.println("DVD Player is OFF.");
	    }
}
/*
// Facade Class
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(5);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}

// Client Code
public class HomeTheaterSystem {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Using the facade to watch a movie
        homeTheater.watchMovie();

        // Ending the movie
        homeTheater.endMovie();
    }
}

// Subsystem Classes (remains the same as above)
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON.");
    }
    public void play() {
        System.out.println("DVD Player is playing.");
    }
    public void off() {
        System.out.println("DVD Player is OFF.");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON.");
    }
    public void setInput(String input) {
        System.out.println("Projector input set to " + input + ".");
    }
    public void off() {
        System.out.println("Projector is OFF.");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON.");
    }
    public void setVolume(int volume) {
        System.out.println("Sound System volume set to " + volume + ".");
    }
    public void off() {
        System.out.println("Sound System is OFF.");
    }
}

*/

