package practiceProject;

import java.util.Scanner;

public class dogDayCare {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	
	int initialPrice = scan.nextInt();
	int pricePerDay = scan.nextInt();
	int totalDays = scan.nextInt();
	
	int priceAndDay = pricePerDay * totalDays;
	int totalCost = priceAndDay + initialPrice;
	
	System.out.println (totalCost);
	
	}
	

}
