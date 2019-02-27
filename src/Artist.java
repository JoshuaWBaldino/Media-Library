
public class Artist extends Media {

	private String last;
	private String first;
	private String birthDate;
	private String twitterHandle;
	private String url;
	
	public Artist() {
		this.last = null;
		this.first = null;
		this.birthDate = null;
		this.twitterHandle = null;
		this.url = null;
	}
	
	public Artist( String last, String first, String birthDate, String twitterHandle, String url ) {
		this.last = last;
		this.first = first;
		this.birthDate = birthDate;
		this.twitterHandle = twitterHandle;
		this.url = url;
	}
	
	public String toString() {
		return "\nArtist name: " + first + " " + last + "\nDate of birth: " + birthDate + "\nTwitter handle: " 
				+ twitterHandle + "\nUrl: " + url;
	}
	
	public boolean equals(Object k) {
		boolean output = false;
		if(k instanceof Artist) {
			Artist m = (Artist)k;
			output = (this.last.equals(m.last) && this.first.equals(m.first) &&  this.birthDate.equals(m.birthDate) && this.twitterHandle.equals(m.twitterHandle) && this.url.equals(m.url));
		}
		return output;
	}
}
