package cgg.defaultandstaticmethods;

public class Welcome implements I1,I2 {

	@Override
	 public void display() {
		//System.out.println("WELCOME ");
		I1.super.display();//to access interface
		
	}
	 public static void main(String[] args) {
		Welcome welcome = new Welcome();
		welcome.display();
	}
}
