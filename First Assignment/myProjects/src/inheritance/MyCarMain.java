package inheritance;

public class MyCarMain {

	public static void main(String[] args) {
		Car mycar=new EV();
		EV mycar2=new EV();
		FuelEngine mycar3=new FuelEngine();
		mycar2.chargeBattery();
		mycar3.colour="Black";
		mycar3.model="Benz";
		mycar3.regNo="KL-07-A-5656";
		mycar2.batteryCapacity=50000;
		mycar3.engineCC=2000;
		//mycar3.showCarInfo();
		mycar.stop();
		mycar2.stop();
		mycar2.start();
	}

}
