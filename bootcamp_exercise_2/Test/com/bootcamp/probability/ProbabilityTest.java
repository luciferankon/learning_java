package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

	@Test
	void shouldThrowExceptionIfValueIsLessThanZero() {
		assertThrows(InvalidProbabilityException.class, () -> Probability.initialize(-0.3));
	}

	@Test
	void shouldThrowExceptionIfValueIsMoreThanOne() {
		assertThrows(InvalidProbabilityException.class, () -> Probability.initialize(2));
	}

	@Test
	void shouldCreateObjectIfValueIsValid() {
		assertDoesNotThrow(() -> Probability.initialize(0.5));
	}

	@Test
	void shouldGiveMeTheChancesOfEventNotHappening() throws InvalidProbabilityException {
		Probability chancesOfGettingTails = Probability.initialize(0.3);
		Probability expected = Probability.initialize(0.7);
		Probability actual = chancesOfGettingTails.not();
		assertEquals(expected, actual);
	}

	@Test
	void shouldReturnTheCombineProbability() throws InvalidProbabilityException {
		Probability probability = Probability.initialize(0.5);
		Probability otherProbability = Probability.initialize(0.5);
		Probability expected = Probability.initialize(0.25);
		Probability actual = probability.and(otherProbability);
		assertEquals(expected, actual);
	}

	@Test
	void shouldReturnOrOfTwoProbabilities() throws InvalidProbabilityException {
		Probability probability = Probability.initialize(0.5);
		Probability otherProbability = Probability.initialize(0.5);
		assertEquals(Probability.initialize(0.75), probability.or(otherProbability));
	}
}