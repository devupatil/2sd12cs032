package com;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1=s.nextInt();
		System.out.println("Enter the second Number");
		int num2=s.nextInt();
		System.out.println("Before Swap number1  "+ num1+ " and number2 "+num2  );
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap number1  "+ num1+ " and number2 "+num2  );
	}

}
