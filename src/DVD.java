
public class DVD extends Video {

	private String specialFeatures[];
	private int numFeatures;
	private String wideScreenFormat;
	private String TVFormat;
	private String soundOptions[];
	private int numSoundOptions;
	
	public DVD() {
		super();
		this.specialFeatures = new String[0]; 
		this.numFeatures = 0;
		this.wideScreenFormat = null;
		this.TVFormat = null;
		this.soundOptions = new String[0];
		this.numSoundOptions = 0;
	}
	
	public DVD(String title, Artist majorArtist, int playTime, Artist[] supportingActors, int numActors, Artist director, int rating, String specialFeatures[], int numFeatures, String wideScreenFormat, String TVFormat, String soundOptions[], int numSoundOptions) {
		super(title, majorArtist, playTime, supportingActors, numActors,  director, rating);
		this.specialFeatures = specialFeatures; 
		this.numFeatures = specialFeatures.length;
		this.wideScreenFormat = wideScreenFormat;
		this.TVFormat = TVFormat;
		this.soundOptions = soundOptions;
		this.numSoundOptions = soundOptions.length;
	
	}
	
	public String playMedia() {
		return super.playMedia();
	}
	
	public String listFeatures(String[] w) {
		String line = "";
		for(int i=0; i < w.length; i++) {
			line += w[i] + ", ";
		}
		return line;
	}
	public String listSound(String[] r) {
		String line = "";
		for(int i=0; i < r.length; i++) {
			line += r[i] + ", ";
		}
		return line;
	}
	
	
	
	public String toString() {
		return super.toString() + "\nThe number of Features is: " + numFeatures + "\nThe list of Features: " + listFeatures(specialFeatures) + "\nThe wide screen format is: " + wideScreenFormat + "\nThe tv format is: " + TVFormat + "\nThe number of sound options are: " + numSoundOptions + "\nThe list of sound options is: " + listSound(soundOptions);
	}
	
	}




