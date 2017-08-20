package practiceProject;

import java.util.Scanner;

public class firstNameGenerator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String firstName;
		System.out.println ("What is your first name?");
		firstName = scan.next();
		
		String lastName;
		System.out.println ("What is your last name?");
		lastName = scan.next();
		
		String fullName;
		fullName = firstName + lastName;
		System.out.println ("Hello " + fullName);
		
		
		

	}

}
