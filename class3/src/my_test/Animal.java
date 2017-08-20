package my_test;

public class Animal {
	
	public int numberOfLegs;
	public String animalName;
	
	public Animal (int NOL, String AnimalN){
		
		System.out.println ("I am in the constructor");
		
	}
	
	public Animal (){
		
		System.out.println("I am in the constructor with no input");
	}
	
	public void run (){
		
		System.out.println ("Tha animal is running");
	}
	
	public void run (int x){
		
		System.out.println ("Tha animal is running with input");
	}
	
	public void sleep (){
		
		System.out.println ("The animal is sleeping");
		
	}

}
