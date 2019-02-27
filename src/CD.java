
public class CD extends Audio {

	private String tracks[];
	private int numTracks;
	
	public CD() {
		super();
		this.tracks = new String[0];
		this.numTracks = numTracks;
	}
	
	public CD(String title, Artist majorArtist, int playTime, Artist[] groupMembers, int numMembers, Artist producer, String tracks[], int numTracks) {
		super(title, majorArtist, playTime, groupMembers, numMembers, producer);
		this.tracks = tracks;
		this.numTracks = tracks.length;
	}
	
	public String playMedia() {
		return super.playMedia();
	}
	
	public String listTracks(String[] j) {
		String line = "";
		for(int i=0; i < j.length; i++) {
			line += j[i] + ", ";
		}
		return line;
	}
	
	public String toString() {
		return "The number of tracks are: " + numTracks + "\nThe Track list is: " + listTracks(tracks) + super.toString();
	}
}
