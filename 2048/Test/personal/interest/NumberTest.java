package personal.interest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberTest {

	@Test
	void shouldCreateNumberIfItIsTwosExponent() {
		assertDoesNotThrow(() -> Number.createNumber(4));
	}

	@Test
	void shouldNotCreateNumberIfItIsNotTwosExponent() {
		assertThrows(InvalidNumberException.class, () -> Number.createNumber(3));
	}
}