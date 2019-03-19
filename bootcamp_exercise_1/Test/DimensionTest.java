import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DimensionTest {
	@Test
	void shouldGiveMeTheDimension() throws Exception {
		Dimension dimension = new Dimension(3.0);
		assertEquals(dimension.getValue(), 3.0);
	}

	@Test
	void shouldThrowExceptionForNegativeNumbers() {
		assertThrows(NegativeDimensionException.class, () -> new Dimension(-1));
	}
}