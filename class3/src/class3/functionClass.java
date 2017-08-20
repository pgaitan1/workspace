package class3;

import java.util.Scanner;

public class functionClass {
	
	@SuppressWarnings("resource")
	public int add (){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Please enter two numbers");
		int x = scan.nextInt();
		int y = scan.nextInt();
			
		int sum = (x+y);
		return sum;
		}
	
	
	public void firstName (String myname){
		
		System.out.println (myname);
		
		
	}
	

}
