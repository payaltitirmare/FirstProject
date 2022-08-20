package Interfaces;

public class CamDogish implements Dog,Fish,Camel {

	@Override
	public void move() {
		System.out.println("this normal method implemented in child class");
        
		Dog.super.move();
		Dog.Animal_voice();
		Fish.super.move();
		Camel.super.move();
	}

	@Override
	public void move1() {
		 
		
	}

	public static void main(String[] args) {
		
		CamDogish cdf=new CamDogish();
		cdf.move();
	}

	
	
}
