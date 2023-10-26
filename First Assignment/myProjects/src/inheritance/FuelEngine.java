package inheritance;
public class FuelEngine extends Car{
	double engineCC;
	public void refillFuel() {
		System.out.println("refill fuel");
	}
	public void showCarInfo() {
		super.showCarInfo();
		System.out.println( "Engine cc: "+engineCC);
	}



}
