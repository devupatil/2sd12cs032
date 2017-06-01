package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Enter the number to check for prime");
		int number=s.nextInt();
		int temp=(int) Math.sqrt(number);
		for(int i=2;i<=temp;i++){
			if(number%i==0){
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println(+number+ " is prime ");
		}
		else if(flag==true){
			System.out.println(+number+ " is  not prime ");
		}
	}

}
