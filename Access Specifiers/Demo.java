package pack1;

public class Demo {
	
	private void disp() {
		
		
		System.out.println("Private () is running....");
		
	}
	
	void disp1() {
		
		System.out.println("Default () is running.....");
		
	}
	
	protected void disp2() {
		
		System.out.println("Protected () is running.....");
		
	}
	
	public void disp3() {
		
		System.out.println("Public () is running.....");
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		Demo d1 = new Demo();
		d1.disp();
		d1.disp1();
		d1.disp2();
		d1.disp3();
		System.out.println("Program Ended");
	}
}
