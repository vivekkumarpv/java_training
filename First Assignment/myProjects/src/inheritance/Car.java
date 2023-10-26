package inheritance;

public class Car {
	protected String model;
	protected String colour;
	protected String regNo;
		
	public void start() {
		System.out.println("Car Started");
	}public void brake() {
		System.out.println("Brake applied");
	}
	static void stop() {
		System.out.println("Car stopped");

	}
	
	public void showCarInfo() {
		System.out.println("Model: "+model);
		System.out.println("Colour: "+colour);
		System.out.println("Registration Number: "+regNo);
	}

}
