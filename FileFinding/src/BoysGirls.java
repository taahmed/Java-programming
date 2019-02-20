
	//import java.util.Scanner;
	import java.io.*;
	import java.util.*;

	public class BoysGirls {

		public static void main(String[] args) throws FileNotFoundException {
			
				Scanner readInput = new Scanner(new File("boysgirls.txt"));
				boyGirls(readInput);
				readInput.close();
		}

		
		public static void boyGirls (Scanner readInput) throws FileNotFoundException {
			
			int numBoys=0, numGirls=0; 
			int sumBoys=0, sumGirls = 0;
			int lineCount = 0;
			while(readInput.hasNextLine()) {
				String readString = readInput.next();
				if (lineCount%2 == 0) {
					numBoys +=1;
					sumBoys += readInput.nextInt();
				}
				else {
					numGirls = numGirls+1;
					sumGirls += readInput.nextInt();			
				}
				lineCount++;
			}
			System.out.printf("%d boys, %d girls", numBoys, numGirls);
			System.out.println("\nDifference between boys' and girls' sums: " + Math.abs(sumBoys - sumGirls));
		}
	}
