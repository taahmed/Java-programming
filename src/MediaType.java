
public abstract class MediaType {

	private String itemNumber;
	private String mTitle;
	private String mType;
	private boolean reserve;
	private boolean borrowStatus = false;

	public MediaType (String itemNumber, String mTitle) { 
		this.itemNumber= itemNumber;
		this.mTitle =mTitle;
	}

	public String toString() {
		return "itemNumber" + itemNumber + "\nReserved: " + this.isReserve() + "\nCheckin: " + this.isCheckin() +
											"\nborrowStatus: " + this.isborrowStatus() + "\nMedia Type: " + mType;
	}

	public boolean isReserve() {
		return reserve;
	}

	public void setReserve(boolean Reserve) {
		this.reserve = reserve;
	}
	public String isCheckin() {
		return itemNumber + " has been Checked in";
	}
	
	public boolean isborrowStatus() {
		return borrowStatus;
	}

	public void setborrowStatus(boolean borrowStatus) {
		this.borrowStatus = borrowStatus;
	}

	public void setmType(String mType) {
		this.mType = mType;
	}

}
