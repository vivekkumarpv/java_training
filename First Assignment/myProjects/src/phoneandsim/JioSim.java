package phoneandsim;

public class JioSim extends Sim {
	public void call(){
		System.out.println("Making a call with jio...");
	}
	public void sendSms(){
		System.out.println("Sending a text with jio...");
	}
	public void browseInternet() {
		System.out.println("internet browsed with jio...");
	}
}