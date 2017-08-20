import java.util.Scanner;

public class testRun2 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println ("Provide the value for the first number:\n");
		int x = scan.nextInt();
		System.out.println ("Provide the value for the second number:\n");
		int y = scan.nextInt();
		
		functionTest ft1 = new functionTest();
		int sum = ft1.add(x, y);
		System.out.println (sum);
		String name = ft1.getFirstName("Tom");
		System.out.println (name);
		
			

	}
}