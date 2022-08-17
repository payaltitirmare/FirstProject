package Interfaces;

 class Temp1 implements It1,It1.It2 {

	public void m1() {
		System.out.println("m1 method imlem");
	}
	
	public void m2() {
		System.out.println("m2 ,ethod implement");
	}
	public static void main(String[] args) {
		
		Temp1 t=new Temp1();
		t.m1();
		t.m2();
	}



}
