package inheritance;

public class EV extends Car{
	double batteryCapacity;
	public void chargeBattery() {
		System.out.println("charge battery");
	}
	public void start() {
		super.start();
		System.out.println("My EV Started");
	}
	static void stop() {
		System.out.println("EV stopped");

	}
	public void showCarInfo() {
		super.showCarInfo();
		System.out.println("Battery capacity in AH: "+batteryCapacity);
	}
	
}
