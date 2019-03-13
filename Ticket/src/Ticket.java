
public class Ticket {

	// fields
	protected int ticketNumber;
	protected int ticketPrice;

	// constructor method to get ticket number
	public Ticket(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	// get the price of the ticket
	public int getPrice() {
		return ticketPrice;

	}

	// set the toString, ticketNumber and price
	public String toString() {
		return "Number: " + ticketNumber + ", Price: $" + ticketPrice;
	}

}