package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntSubtractionTest {

	@Test
	void testSubtract() {
		IntSubtraction tester = new IntSubtraction();
		assertEquals("POSITIVE", tester.subtract(10, 5), "10 - 5 must be POSITIVE");
	}

}
