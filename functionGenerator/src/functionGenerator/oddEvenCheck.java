package functionGenerator;

import java.util.Scanner;

public class oddEvenCheck {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Please enter a number");
		
		int OddEvenCheck = scan.nextInt();
		
		if (OddEvenCheck %2 ==0){
			System.out.println ("You have entered an even number");

		}
		else{
		System.out.println ("You have enetered an odd number");
		}
		
	}

}
