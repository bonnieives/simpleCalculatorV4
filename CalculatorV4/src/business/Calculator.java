package business;

import java.util.Scanner;

public class Calculator {
	
	public double firstNumber;
	public double secondNumber;
	public int option;
	
	// Constructors
	public Calculator() {
		this.firstNumber = 0;
		this.secondNumber = 0;
	}
	
	public Calculator(double informedNumber1, double informedNumber2) {
		informedNumber1 = this.firstNumber;
		informedNumber2 = this.secondNumber;
	}

	// Properties
		// First Number
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber() {
		this.firstNumber = 0;
	}
		//Second Number
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber() {
		this.secondNumber = 0;
	}
	
	// Methods
	public static int menu() {
		
		int optionMenu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean testMenu = false;
		
		do {			
			try {
				testMenu = true;

				System.out.println("Please inform the operation you want to perform");
				System.out.println("\t1 - Adding.");
				System.out.println("\t2 - Subtraction.");
				System.out.println("\t3 - Multiplication.");
				System.out.println("\t4 - Module.");
				System.out.println("\t0 - Quit the application.");
				optionMenu = scan.nextInt();
			
			} catch (Exception exception) {
				
				System.out.println("Please inform a valid option.");
				scan.next();
				testMenu = false;
			}
			
		} while(testMenu == false);
		
		return optionMenu;
	}
	
	public static double add(double informedNumber1, double informedNumber2) {
		return informedNumber1 + informedNumber2;		
	}
	
	public static double sub(double informedNumber1, double informedNumber2) {
		return informedNumber1 - informedNumber2;		
	}
	
	public static double mult(double informedNumber1, double informedNumber2) {
		return informedNumber1 * informedNumber2;		
	}
	
	public static double mod(double informedNumber1, double informedNumber2) {
		return informedNumber1 / informedNumber2;		
	}
}
