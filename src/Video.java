
public class Video extends Media{

	private Artist supportingActors[];
	private int numActors;
	private Artist director;
	private int rating;
	
	public Video() {
		super();
		this.numActors = 0;
		this.director = null;
		this.supportingActors = new Artist[0];
		this.rating = 0;
	}
	
	public Video(String title, Artist majorArtist, int playTime, Artist[] supportingActors, int numActors, Artist director, int rating) {
	super(title, majorArtist, playTime);
		this.numActors = supportingActors.length;
		this.director = director;
		this.supportingActors = supportingActors;
		this.rating = rating;
	}
		
	public String playMedia() {
		return super.playMedia() + "This is the rating: "+ rating + " out of 5";
	}
	
	public String listSupports(Artist [] h) {
		String line = "";
		for(int i=0; i < h.length; i++) {
			line += h[i] + ", ";
		}
		return line;
	}
	
	public String toString() {
		return "The number of actors are: " + numActors + "\nThe list of actors is: " + listSupports(supportingActors) + "\nThe director is: " + director + "\nThe rating is: " + rating + " out of five " + super.toString(); 
	}
}
