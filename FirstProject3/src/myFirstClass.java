import java.util.Scanner;

public class myFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Provide th value for the first number:\n");
		int x = scan.nextInt();
		System.out.println ("Provide the value for the second number:\n");
		int y = scan.nextInt();
		int sum = x+y;
		
		System.out.println ("This is the total value:\n");
		
		
		System.out.println (sum);
		
		
		

	}

}
