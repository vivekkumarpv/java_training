package polymorphism;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		String output=calc.add("hello"," world");
		System.out.println(output);
		int output2=calc.add(25, 25);
		System.out.println(output2);
		float output3=calc.add(25.8f, 25.6f);
		System.out.println(output3);
	}
}
