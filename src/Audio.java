
public class Audio extends Media{

	private Artist groupMembers[];
	private int numMembers;
	private Artist producer;
	
	public Audio() {
		super();
		this.groupMembers = new Artist[0];
		this.numMembers = 0;
		this.producer = null;
	}
	
	public Audio( String title, Artist majorArtist, int playTime, Artist groupMembers[], int numMembers, Artist producer) {
	super(title, majorArtist, playTime);
	this.groupMembers = groupMembers;
	this.numMembers = groupMembers.length;
	this.producer = producer;
	}
	
	public String listMembers(Artist[] k) {
		String line = "";
		for(int i=0; i < k.length; i++) {
			line += k[i] + ", ";
		}
		return line;
	}
	
	public String playMedia() {
		return super.playMedia(); 
	}
	
	public String toString() {
		return super.toString() +  "\nThenNumber of members: " + numMembers + "\nThe list of Members: " + listMembers(groupMembers) + "\nProducer: " + producer;
		
	}
	
	
}
