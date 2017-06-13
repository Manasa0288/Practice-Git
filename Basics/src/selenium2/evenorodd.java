package selenium2;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		//String str;
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an Integer number:");
		
		n = in.nextInt();
		
		//n = Integer.getInteger(str);
		if(n % 2 ==0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
			

	}

}
