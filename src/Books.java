
public class Books extends MediaType{
	
	private String mType;
	private String author;
	private String publisher;
	
	public Books(String itemNumber, String mTitle, String author, String publisher) {	
		super(itemNumber, mTitle);
		super.setmType("Books ");
		this.author = author;
		this.publisher = publisher;
		
		}

	public String toString() {
		return super.toString() + "\nPublisher: " + publisher + "\nAuthor: " +  author  ;
	}
}