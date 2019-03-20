
public class Dvd extends MediaType {

	private String mType;
	private String director;
	
	
	public Dvd(String itemNumber, String mTitle, String director) {	
		super(itemNumber, mTitle);
		super.setmType("Dvd");
		this.director = director;
		
		
		}
	public String toString() {
		return super.toString() + "\nDirector: " + director ;
	}
	}