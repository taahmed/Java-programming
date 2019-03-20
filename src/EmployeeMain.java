import java.text.NumberFormat;

public class EmployeeMain {
public static void main(String[] args) {
	
		Employee[] e = { new Lawyer(), //index 0
						 new Janitor(), //index 1
						 new HarvardLawyer() //index 2
		};
		
		for(int i= 0; i< e.length; i++) {
			
			System.out.println("My Salary is " + NumberFormat.getCurrencyInstance().format(e[i].getSalary()));
			System.out.println("My Vacation is: "+ e[i].showVacation() + " Days");
			System.out.println(e[i].getVacationForm());
			
			System.out.println();
		}
		
		Lawyer lawyer1 = new Lawyer();
		lawyer1.sue();
		Janitor janitor1 = new Janitor();
		janitor1.clean();
	}
}
