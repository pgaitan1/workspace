package fifthClass;

public class MyFunctionw {
	
	public void printString (String x){
		
		
		System.out.println(x);
		
	}
	
	public int add (int x, int y){
		
		int sum =x + y;
		return sum;
	}
	
	public boolean testSpeed (int speed){
		
		boolean x;
		if (speed >80){
			x = true;
		}
		else {
			x = false;
		}
		return x;
		
	}
}
