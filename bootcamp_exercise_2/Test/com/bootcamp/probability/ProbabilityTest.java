package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {

	@Test
	void shouldThrowExceptionIfValueIsLessThanZero() {
		assertThrows(InvalidProbabilityException.class, () -> new Probability(-0.3));
	}

	@Test
	void shouldThrowExceptionIfValueIsMoreThanOne() {
		assertThrows(InvalidProbabilityException.class, () -> new Probability(2));
	}

	@Test
	void shouldCreateObjectIfValueIsValid() {
		assertDoesNotThrow(() -> new Probability(0.5));
	}

	@Test
	void shouldGiveMeTheChancesOfEventNotHappening() throws InvalidProbabilityException {
		Probability chancesOfGettingTails = new Probability(0.3);
		Probability expected = new Probability(0.7);
		Probability actual = chancesOfGettingTails.getChanceOfNotHappening();
		assertEquals(expected, actual);
	}

	@Test
	void shouldReturnTheCombineProbability() throws InvalidProbabilityException {
		Probability probability = new Probability(0.5);
		Probability otherProbability = new Probability(0.5);
		Probability expected = new Probability(0.25);
		Probability actual = probability.combine(otherProbability);
		assertEquals(expected, actual);
	}
}