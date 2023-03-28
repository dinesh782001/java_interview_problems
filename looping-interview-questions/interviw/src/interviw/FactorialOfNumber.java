package interviw;

import java.util.Scanner;

public class FactorialOfNumber {
//Write a program to find the factorial value of any number

	public static void main(String[] args) {
		
		//Factorial of a positive integer (number) is the sum of multiplication of all the integers smaller than that positive integer. For example, factorial of 5 is 5 * 4 * 3 * 2 * 1 which equals to 120
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the factorial value");
		int input=scanner.nextInt();
         int fact=1;
//		Formula
//		n! = n \times (n-1) \times \dots \times 1
		for(int i=1;i<=input;i++) {
			fact*=i;
		}
		System.out.println(fact);
		//to find the factorial of a number we can also assume as base number and power number
		
		
	}
}
