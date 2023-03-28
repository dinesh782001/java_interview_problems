package interviw;

import java.util.Scanner;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//Write a program to find sum of all even numbers between 1 to n

		System.out.println("enter the number");
		int number=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
			sum=sum+i;
			
			}
			System.out.println(sum);
			
		}
			
	}
	}

