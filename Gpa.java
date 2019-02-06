package ch05;

import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGPA();
	}
	public static void printGPA() {

	    Scanner console = new Scanner(System.in);

	    System.out.print("Enter a student record: ");//use tab to enter the student's record
	    String name = console.next();

	    int numScore = console.nextInt();
	    double sum = 0.0;
	    
	    for (int i = 0; i < numScore; i++) {
	        int score = console.nextInt();
	        sum += score;
	    }
	    
	    double average = sum / numScore;
	    System.out.println(name + "'s grade is " + average);

	}
}
