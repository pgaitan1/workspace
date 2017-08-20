import java.util.Scanner;

public class secondClass {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
		System.out.println ("Provide the value for the first number:\n");
		int x = scan.nextInt();
		System.out.println ("Provide the value for the second number:\n");
		int y = scan.nextInt();
		boolean test = true;
		
		if (test){
			System.out.println ("the numbers are the same");
		}
		
		if (x>y){
			System.out.println ("The first number is more than the second");
			
		}
		
		if (x<y){
			
			System.out.println("The second number is more than the first");
		}

	}

}
