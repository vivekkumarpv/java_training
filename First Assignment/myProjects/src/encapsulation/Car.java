package encapsulation;

public class Car {
	private String model;
	private String colour;
	private String regNo;
	
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public void setRegNo(String regNo) {
		this.regNo=regNo;
	}
	
	public Car() {	
	}
	public Car(String model, String colour, String regNo) {
		this.model = model;
		this.colour = colour;
		this.regNo = regNo;
	}
	
	public void start() {
		System.out.println("Car Started");
	}public void brake() {
		System.out.println("Brake applied");
	}
	
	public void showCarInfo() {
		System.out.println("Model: "+model);
		System.out.println("Colour: "+colour);
		System.out.println("Registration Number: "+regNo);
	}

}
