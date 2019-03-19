import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {
	@Test
	void shouldReturn9IfTheSideIs3() throws Exception {
		Square square = new Square(new Dimension(3));
		assertEquals(9, square.calculateArea());
	}

	@Test
	void shouldReturn12IfTheSideIs3() throws Exception {
		Square square = new Square(new Dimension(3));
		assertEquals(12, square.calculatePerimeter());
	}

	@Test
	void shouldThrowNegativeDimensionException() {
		assertThrows(NegativeDimensionException.class, () -> new Square(new Dimension(-3)));
	}
}