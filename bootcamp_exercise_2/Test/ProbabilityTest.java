import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {

	@Test
	@DisplayName("It should throw exception when the value is less than zero")
	void shouldThrowExceptionIfValueIsLessThanZero() {
		assertThrows(InvalidProbabilityException.class, () -> new Probability(-0.3));
	}

	@Test
	@DisplayName("It should throw exception when the value is more than one")
	void shouldThrowExceptionIfValueIsMoreThanOne() {
		assertThrows(InvalidProbabilityException.class, () -> new Probability(2));
	}

	@Test
	@DisplayName("It should not throw any exception when the value is between zero and  one")
	void shouldCreateObjectIfValueIsValid() {
		assertDoesNotThrow(() -> new Probability(0.5));
	}
}