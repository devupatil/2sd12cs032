package com;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("The number to be reversed");
		int temp,result=0;
		int num=s.nextInt();
		while(num>0)
		{
			temp=num%10;
			result=result*10+temp;
			num/=10;
		}
		System.out.println("The number is reversed to "+result);
	}

}
