package interviw;

import java.util.Scanner;

public class ReverseTable {
//Write a program to print reverse tables
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to start");
		int start=scanner.nextInt();
		System.out.println("enter the end bn number");
		int end=scanner.nextInt();
		System.out.println("enter the which table you want");
		int table=scanner.nextInt();
		for(;end>=start;end--)
			System.out.println(end +"*"+table+"="+end*table);
		//we can also use this in while loop like this
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter The Starting Number : ");
//		int s =input.nextInt();
//		System.out.print("Enter The Ending Number : ");
//		int e =input.nextInt();
//		System.out.print("Enter The Tables Number : ");
//		int t =input.nextInt(); 
//		while(s>=e)
//		{
//			System.out.println(s+" * "+t+" = "+(s*t));
//			s--;
//		}

	}
	
	
}
