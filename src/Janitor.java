
public class Janitor extends Employee {
	public int showHours() {
		return 2 * super.showHours();
	}

	public double getSalary() {
		 return super.getSalary()-10000;
	}

	public int showVacation() {
		
		return super.showVacation() / 2;
	}

	public void clean() {
		System.out.println("Workin' for the man.");
	}
}