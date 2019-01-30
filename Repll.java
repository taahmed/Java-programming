package ch04;

public class Repll {

	public static void main(String[] args) {
				
				System.out.println(repl("Java",4));
				}
			public static String repl(String str, int words) {
				String repeat="";
				for(int i=0; i<words; i++) {
					repeat+=str;
				}
			return repeat;
			}

		}

	


