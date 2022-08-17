package Interfaces;

public interface Fish {

	//multipal inheritance or diamond problem example
	
	default void move() {
		
		System.out.println("fish is swimming");
	}
}
