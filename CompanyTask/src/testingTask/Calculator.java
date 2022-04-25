package testingTask;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose the operation: +, -, *, /");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		switch (operator) 
		{
		case '+': int res1 = n1 + n2;
		System.out.println("Addition of " + n1 + " and " + n2 + " is " +res1);
		break;
		
		case '-': int res2 = n1 - n2;
		System.out.println("Subtraction of " + n1 + " and " + n2 + " is " +res2);
		break;
		
		case '*': int res3 = n1 * n2;
		System.out.println("Multiplication of "+  n1  +" and "+  n2  +" is "+res3);
		break;
		
		case '/': int res4 = n1 / n2;
		System.out.println("Division of " + n1 + " and " + n2 + " is " +res4);
		break;
		
		default:
			System.out.println("Invalid Operator");
			break;
		}
		
		sc.close();


	}

}
