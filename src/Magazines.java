
public class Magazines extends MediaType {
	
	private String mType;
	private String publisher;
	
	public Magazines(String itemNumber, String mTitle,  String publisher) {	
		super(itemNumber, mTitle);
		super.setmType("Magazines");
		this.publisher = publisher;
		
		}
	public String toString() {
		return super.toString() + "\nPublisher: " + publisher ;
		
	}
		
	}

		
	