package gr.upatras.junit.first;

public class IntSubtraction {
	public String subtract(int x, int y) {
		if (x-y>0) return "POSITIVE";
		if (x-y<0) return "NEGATIVE";
		return null;
	}
}
