package interviw;

import java.util.Scanner;

public class EvenNumberReverseOrder {

	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit number");
		int limit=scanner.nextInt();
		
		for(int i=0;limit>=i;limit--)
			if(limit%2==0)
				System.out.println(limit);
	}
}
