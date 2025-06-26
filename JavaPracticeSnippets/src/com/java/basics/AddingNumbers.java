package com.java.basics;

import java.util.Scanner;

public class AddingNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A Number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter another Number: ");
		int number2 = sc.nextInt();
		
		int result = number1 + number2;
		
		System.out.println(number1 + " + " + number2 + " = " + result);
		
		sc.close();
	}

}
