package gr.upatras.junit.first;

public class MyMain {

	public static void main(String[] args) {
		IntSubtraction sub = new IntSubtraction();
		String result = sub.subtract(10, 5);
		System.out.println("Result is " + result);
	}

}
