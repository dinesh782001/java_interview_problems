package interviw;

import java.util.Scanner;

public class SumOfAllNumbers {//Write a program to find sum of all odd numbers between 1 to n


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number you want");
		int number=scanner.nextInt(); 
		int sum=0;
		for(int i=1;i<=number;i++)
			if(i%2 !=0)//not equal to zero condition
				sum=sum+i;
		System.out.println(sum);//syso output
				
	}
}
