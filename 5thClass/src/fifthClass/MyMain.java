package fifthClass;

public class MyMain {

	public static void main(String[] args) {
		
		
		MyFunctionw mf= new MyFunctionw();
		
		int x  = mf.add(90, 80);
		System.out.println (x);
		
		mf.printString("Paul");
		
		boolean speed = mf.testSpeed(73);
		
		if (speed) {
			System.out.println("car is over the limit");
			
		}
		
		else {
			System.out.println ("car is under the limit");
			
		}
		
	}

}
