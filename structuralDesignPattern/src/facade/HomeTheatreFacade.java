package facade;

public class HomeTheatreFacade {

	private DVDPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;
	
	public HomeTheatreFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem)
	{ 
		this.dvdPlayer = dvdPlayer; 
		this.projector = projector; 
		this.soundSystem = soundSystem;
	} 
	public void watchMovie() 
	{ 
	System.out.println("Get ready to watch a movie..."); 
	dvdPlayer.on();
	dvdPlayer.play();
	projector.on(); 
	projector.setInput("DVD"); 
	soundSystem.on();
	soundSystem.setVolume(5);
	}
	public void endMovie() 
	{
		System.out.println("Shutting down the home theater..."); 
		dvdPlayer.off(); 
		projector.off();
		soundSystem.off();
	}
	
	
	
	
	
	
}
