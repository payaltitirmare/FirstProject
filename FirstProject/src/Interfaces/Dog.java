package Interfaces;

public interface Dog {
	
	
//example of multipal inheritance/diamond problem in java
	public void move1();
	
	default void move() {
		System.out.println("dog is moving");  //we can implement this default and static but not public 
	}
	
	static void Animal_voice() {
		System.out.println("barking................");
	}
	
	
	
}
