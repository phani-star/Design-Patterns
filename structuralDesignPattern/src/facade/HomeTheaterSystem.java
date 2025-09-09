package facade;

public class HomeTheaterSystem {

	public static void main(String[] args) {
		    DVDPlayer dvdPlayer = new DVDPlayer();
	        Projector projector = new Projector();
	        SoundSystem soundSystem = new SoundSystem();

	       HomeTheatreFacade homeTheater= new HomeTheatreFacade(dvdPlayer, projector, soundSystem);

	        // Using the facade to watch a movie
	        homeTheater.watchMovie();

	        // Ending the movie
	        homeTheater.endMovie();
	}

}
