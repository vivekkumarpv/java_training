package printandscan;

public class PrintScanMain {

	public static void main(String[] args) {
		HpPrinter hp=new HpPrinter();
		hp.print();
		CanonPrinter canon=new CanonPrinter();
		canon.print();
		canon.scan();
	}

}
