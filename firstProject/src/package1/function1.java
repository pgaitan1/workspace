package package1;

import java.util.Scanner;

public class function1 {
	
	Scanner scan = new Scanner(System.in);
	
public int add(){
	
	
	System.out.println("Enter the first number");
	int x = scan.nextInt();
	
	System.out.println("Enter the second number");
	int y = scan.nextInt();
	
	int sum = x+y;
	System.out.println("Your total value");
	return sum;
	
	
}
	public void printmyname (String firstName){
		
		System.out.println(firstName);
		
	}

}
