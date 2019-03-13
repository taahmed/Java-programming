
public class AdvanceTicket extends Ticket {
	
	/* method with two argument to super class and if the days advance >= 10 set the price $30
	   else ticketprice $40 */
	
	public AdvanceTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber);

		if (daysInAdvance >= 10) {
			this.ticketPrice = 30;

		} else {
			this.ticketPrice = 40;
		}

	}

}
