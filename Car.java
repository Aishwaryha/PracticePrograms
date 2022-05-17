package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Break is applied");
	}
	public void applyGear() {
		System.out.println("Change the gear");
	}
	public void switchonAC() {
		System.out.println("Turn on the AC");
	}
	public void applyAccelerate(){
		System.out.println("Apply the accelerator");
	}
	 public static void main(String[] args) {
		 Car obj1=new Car();
		 obj1.applyBreak();
		 obj1.applyGear();
		 obj1.switchonAC();
		 obj1.applyAccelerate();
		
	}
	}
