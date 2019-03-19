public class Dimension {
	private final double value;

	public Dimension(double dimension) throws NegativeDimensionException {
		validate(dimension);
		this.value = dimension;
	}

	private void validate(double dimension) throws NegativeDimensionException {
		if (dimension < 0) throw new NegativeDimensionException();
	}

	double getValue() {
		return this.value;
	}
}
