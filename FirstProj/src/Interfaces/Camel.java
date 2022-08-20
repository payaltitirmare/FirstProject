package Interfaces;

public interface Camel {

	//example of multipal inheritance/diamond problem in java
	
	default void move() {
		System.out.println("camel is moving...");
	}
	
}
