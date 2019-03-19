package com.bootcamp.probability;

class Probability {
	private static final int MINIMUM_PROBABILITY = 0;
	private static final int MAXIMUM_PROBABILITY = 1;
	private double chancesOfGetting;

	private Probability(double value) {
		this.chancesOfGetting = value;
	}

	public static Probability initialize(double value) throws InvalidProbabilityException {
		Probability.validate(value);
		return new Probability(value);
	}

	private static void validate(double value) throws InvalidProbabilityException {
		if (value < MINIMUM_PROBABILITY || value > MAXIMUM_PROBABILITY) {
			throw new InvalidProbabilityException();
		}
	}

	Probability not() {
		return new Probability(MAXIMUM_PROBABILITY - this.chancesOfGetting);
	}

	Probability and(Probability otherProbability) {
		double probabilityValue = this.chancesOfGetting * otherProbability.chancesOfGetting;
		return new Probability(probabilityValue);
	}

	@Override
	public boolean equals(Object otherProbability) {
		if (this == otherProbability) return true;
		if (otherProbability == null || getClass() != otherProbability.getClass())
			return false;
		Probability that = (Probability) otherProbability;
		return Double.compare(that.chancesOfGetting, chancesOfGetting) == 0;
	}

}
