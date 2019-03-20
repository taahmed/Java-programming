
public class Cd extends MediaType {

	private String mType;
	private String artist;
	
	
	public Cd(String itemNumber, String mTitle, String artist) {	
		super(itemNumber, mTitle);
		super.setmType("Cd ");
		this.artist = artist;
		
		
		}
	public String toString() {
		return super.toString() + "\nArtist: " + artist  ;
	}
}		