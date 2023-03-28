package interviw;

import java.util.Scanner;

public class PrintTables {

	//Write a program to print tables

	public static void main(String[] args) {
		//to get starting value
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the starting number");
		int start=scanner.nextInt();
		//to get the ending value 
		System.out.println("where it would be end");
		int end=scanner.nextInt();
		//table 
	System.out.println("which table you want sir");
	int table=scanner.nextInt();
		while(start<=end) {
			System.out.println(start+"*"+table+"="+(start*table));
		     start++;
	}
}
}
