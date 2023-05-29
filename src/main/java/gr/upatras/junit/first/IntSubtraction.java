package gr.upatras.junit.first;

public class IntSubtraction {
	public String subtract(int x, int y) {
		if (x-y>0) return "POSITIVE";
		if (x-y<0) return "NEGATIVE";
		return null;
	}
	public String subtract2(int x, int y, int z) {
		if (x-y-z>0) return "POSITIVE";
		if (x-y-z<0) return "NEGATIVE";
		return null;
	}
}
