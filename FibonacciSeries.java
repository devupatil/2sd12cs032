package com;

import java.util.Scanner;

class FibonacciSeries{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The limit for Fibonacci Series");
	int number=s.nextInt();
		int fib1=0, fib2=1, fib3;
		System.out.println("The fibonacci series within "+number+" are..");
		System.out.print(" "+fib1+" "+fib2+" " );
		for(int i=1;i<=number;i++){
			fib3 = fib1;
			fib1 = fib2;
			fib2 = fib3 + fib2;
			if(fib2<10){
			System.out.print(" "+fib2+" ");
			}
		}
	}
}