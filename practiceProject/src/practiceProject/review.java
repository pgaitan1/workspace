package practiceProject;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("What is your first name?");
		String firstName = scan.nextLine();
		
		System.out.println("What is your last name");
		String lastName = scan.next();
		
		String fullName = (firstName + " " + lastName);
		System.out.println (fullName);
		
		

	}

}
