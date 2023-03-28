package interviw;

import java.util.Scanner;

public class SumOfAllNaturalNumbers {

	//Write a program to find sum of all natural numbers between 1 to n
	
	public void formulaMethod() {
		// this is formula method
		int sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=scanner.nextInt();

		sum=n*(n+1)/2; //this the formula for finding sum of all natural numbers
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		//this is method 2 
		
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the limit");
//		int limit=scanner.nextInt();
//		int sum=0;
//		for(int i=1;i<=limit;i++) {
//		sum=sum+i;
//		System.out.println(sum);
		SumOfAllNaturalNumbers soan=new SumOfAllNaturalNumbers();
		soan.formulaMethod();
		
	}
	
}

