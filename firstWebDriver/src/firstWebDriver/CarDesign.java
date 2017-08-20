package firstWebDriver;

public class CarDesign {
	
	public String color;
	public int doors;
	public String model;
	
	public static int speed;
	
	
	public CarDesign (String col, int doorsnumber, String modelname){
		
		color = col;
		doorsnumber = doors;
		modelname = model;
		
		System.out.println ("I am in the constructor");
		
	}
	
	public CarDesign (){
		
		System.out.println ("I am in the constructor without an input");
		
	}
	
	public void Start(){
		
		System.out.println ("Car is starting");
		
	}
	
	public void Stop(){
		
		System.out.println ("Car is stopped");
		
	}

}
