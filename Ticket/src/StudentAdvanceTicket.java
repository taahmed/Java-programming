
public class StudentAdvanceTicket extends AdvanceTicket {

	// student advance ticket
	public StudentAdvanceTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber, daysInAdvance);

		this.ticketPrice = super.getPrice() / 2;// price is half, student advance ticket

	}

	// override to tostring
	@Override
	
	public String toString() {
		return super.toString() + " (ID required)"; // It requires student ticket for this class, for every student that
													// using the student advance ticket
	}
}