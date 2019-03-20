
public class Lawyer extends Employee{

	@Override
    public String getVacationForm() {
        return "Use the pink vacation form.";
    }
	
	@Override
    public int showVacation() {
        
        return 15;
    }
    
	@Override
    public double getSalary() {
        return 100000.0;
        
    }
    
    public void sue() {
        System.out.println("I'll see you court!");
    }
}

