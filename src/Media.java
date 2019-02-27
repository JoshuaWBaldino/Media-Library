
public class Media {

	private String title; 
	private Artist majorArtist;
	private int playingTime;
	private int numPlays;
	
	public Media() {
		title = null;
		majorArtist = null;
		playingTime = 0;
		numPlays = 0;
	}
	
	public Media( String title, Artist majorArtist, int playTime) {
		this.title = title;
		this.majorArtist = majorArtist;
		this.playingTime = playTime;
	}
	
	public String playMedia() {
		numPlays++;
		return "Now playing: " + title + "\nDuration: " + playingTime + "\nThis has been played: " + numPlays; 
		
	}	

	public String getTitle() {
		return title;
	}

	public int getNumPlays() {
		return numPlays;
	}

	public int getPlayingTime() {
		return playingTime;
	}
	
	public Artist getMajorArtist() {
		return majorArtist;
	}

	public String toString() {
		return "The title is: " + getTitle() + "\nThe major artist is: " + getMajorArtist() + 
				"\nThe playing time is: " + getPlayingTime() + "\nThe number of plays is: " + getNumPlays();
	}

}