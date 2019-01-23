package ch03;

public class printPowerofN {
			
			//Assignment-3: Printing power Of Number 
			//Author: Taher Ahmed 
			//Date: 01/23/2019
			
			public static void main(String[] args) {
			// calling the printPowerofN in the main with two arguments , initialize  twice
			printPowerOfN(2, 7);
			printPowerOfN(5, 3);
			}
			public static void printPowerOfN(int number, int p) {       // method to give two parameters number and p

			for (int i = 0; i <= p; i++) {                             // for loops to start 0 and do the pow to increment
			System.out.print((int) Math.pow(number, i) + " ");        // print, cast from double to int call
			
			// the math class print number and i which is pow now

			}
			System.out.println("");// break a new line or start a new line
			}
}