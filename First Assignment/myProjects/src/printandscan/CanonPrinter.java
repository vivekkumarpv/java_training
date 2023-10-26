package printandscan;

public class CanonPrinter implements Scanners,Printer {
	public void print() {
		System.out.println("canon printer");
	}
	public void scan() {
		System.out.println("canon scanner");
	}
}
