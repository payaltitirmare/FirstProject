package Interfaces;

public class I1I2 implements I2 {

	
	@Override
	public void show() {
	System.out.println("show ,ethod");
		
	}

	@Override
	public void disp() {
		System.out.println("disp method ");
		
	}

	@Override
	public void show1() {
		System.out.println("show 1 interface 2");
		
	}

	public static void main(String[] args) {
		
		I2 i2=new I1I2();
		
		i2.show();
		i2.show1();
		i2.disp();
	}

}
