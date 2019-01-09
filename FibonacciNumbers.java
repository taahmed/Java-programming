package ch1continued;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 12, f1 = 0, f2 = 1;
		  System.out.print("First " + n + " terms: ");

		  for (int i = 0; i <= n; ++i)
		  {
		  System.out.println(f1);

		  int sum = f1 + f2;
		  f1 = f2;
		  f2 = sum;
		        }
		    }
		
	}


