
public class ClientStudentTicket {

	public static void main(String[] args) {

		// create walk up ticket method.
		Ticket myTicket = new WalkUpTicket(10);

		System.out.println(myTicket.toString());

		Ticket studTicket1 = new StudentAdvanceTicket(23, 8);
		Ticket studTicket2 = new StudentAdvanceTicket(24, 11);
		Ticket advTicket1 = new AdvanceTicket(25, 10);
		Ticket advTicket2 = new AdvanceTicket(26, 7);
		
		System.out.println(studTicket1.toString());
		System.out.println(studTicket2.toString());
		System.out.println(advTicket1.toString());
		System.out.println(advTicket2.toString());
	}
}