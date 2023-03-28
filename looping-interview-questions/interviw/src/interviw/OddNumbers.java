package interviw;

import java.util.Scanner;

public class OddNumbers {

	//Write a program to print all even numbers between 1 to 100
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit number");
		int limit=scanner.nextInt();
		for(int i=0;i<=limit;i++)
			if(i%2 != 0)
				System.out.println(i);
	}
}
