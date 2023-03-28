package interviw;

import java.util.Scanner;

public class PowerOfANumber {

	
	
	//Write a program to find the value of one number raised to the power of another
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter");
		int data=scanner.nextInt();
		System.out.println("base number plz");
		int base=scanner.nextInt();
		
			int result=1;	
		for(int i=1;i<=data;i++) {
			result=result*base;
		}
		System.out.println(result);
	
	}
}
