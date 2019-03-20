
public class HarvardLawyer extends Lawyer {
	public double getSalary() {
		return super.getSalary() * 1.2;
		
	}

	@Override
	public int showVacation() {
		
		return super.showVacation() + 3;
	}

	@Override
	public String getVacationForm() {
		
		return "PinkPinkPinkPink";
		
	}
}