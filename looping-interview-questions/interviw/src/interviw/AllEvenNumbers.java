package interviw;

import java.util.Scanner;

public class AllEvenNumbers {
	 
	//lets create a method first for print the even numbers
	
	public void evenNumbers() {
	 Scanner scanner=new Scanner(System.in);//to get the input from the user
	
		//Write a program to print all even numbers between 1 to 100

	System.out.println("enter the limit number");
	int limit=scanner.nextInt();
	for(int i=0;i<=limit;i++)
		if(i%2==0)//condition to check the number is whether even or not
			System.out.println(i);
		
	
	}
	
	public static void main(String[] args) {
		AllEvenNumbers alleven=new AllEvenNumbers();
		alleven.evenNumbers();
	}
 
}
