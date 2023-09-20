package client;

import java.util.Scanner;
import business.Calculator;

public class CalculatorAplication {

	public static void main(String[] args) {
		
		// creating the object scan
		Scanner scan = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
				
		boolean testNumber1 = false;
		boolean testNumber2 = false;
		boolean testOption = false;
		boolean testYesNo = false;
		
		int yesNo = 0;
		
		// First loop to read the first number and validate it as a double		
		do {
			
			try {
				testNumber1 = true;
				
				System.out.println("Please inform the first number:");
				calculator.firstNumber = scan.nextInt();				
				
			} catch (Exception exeption1) {
				
				System.out.println("Please inform a valid number.");
				scan.next();
				
				testNumber1 = false;
			}			
		} while (testNumber1 == false);
		
		// Second loop to read the first number and validate it as a double		
		do {
			
			try {
				testNumber2 = true;
				
				System.out.println("Please inform the second number:");
				calculator.secondNumber = scan.nextInt();				
				
			} catch (Exception exeption2) {
				
				System.out.println("Please inform a valid number.");
				scan.next();
				
				testNumber2 = false;
			}			
		} while (testNumber2 == false);
		
		// Loop with the options
		do {
			try {
				
				// Displaying the menu
				calculator.option = calculator.menu();
								
			} catch (Exception exeption3) {
				
				System.out.println("Please inform a valid option.");
				scan.next();
			}
			
			switch (calculator.option) {
			
				case 1:
					System.out.println(calculator.firstNumber + " + " + calculator.secondNumber + " = " + calculator.add(calculator.firstNumber, calculator.secondNumber));					
					testYesNo = false;
					break;
				
				case 2:
					System.out.println(calculator.firstNumber + " - " + calculator.secondNumber + " = " + calculator.sub(calculator.firstNumber, calculator.secondNumber));
					testYesNo = false;
					break;
					
				case 3:
					System.out.println(calculator.firstNumber + " * " + calculator.secondNumber + " = " + calculator.mult(calculator.firstNumber, calculator.secondNumber));;
					testYesNo = false;
					break;
					
				case 4:
					System.out.println(calculator.firstNumber + " / " + calculator.secondNumber + " = " + calculator.mod(calculator.firstNumber, calculator.secondNumber));
					testYesNo = false;
					break;				
				case 0:
					testOption = true;
					testYesNo = true;
					break;
					
				default:
					System.out.println("Invalid option. Try again.");
					//testYesNo = true;
					System.out.println(testYesNo);
			}
					
			// Loop with the options to perform other operation
			
			if (testYesNo == false) {
				do {
					
					try {
						
						testYesNo = true;
						System.out.println("Do you want to perform other operation?");
						System.out.println("(1) Yes -- (2) No");
						yesNo = scan.nextInt();
						
					} catch (Exception exception3) {
						System.out.println("Please inform a valid option.");
						scan.next();
						testYesNo = false;
					}
					
					if (yesNo == 1) {
						testOption = false;
					} else if (yesNo == 2) {
						testOption = true;
					} else {
						testYesNo = false;
					}
					
				} while (testYesNo == false);
			}
			
		} while (testOption == false);
		
		System.out.println("You quitted the application.");
		
		// Closing the object scan
		scan.close();
	}

}
