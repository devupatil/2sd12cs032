package com;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find Sum of digits");
		int digit,sum=0;
		int num=s.nextInt();
		while(num>0){
			digit=num%10;
			sum=sum+digit;
			num/=10;
		}
		System.out.println("The sum of digits is:" +sum);
	}

}
