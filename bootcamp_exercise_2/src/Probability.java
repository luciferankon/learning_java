public class Probability {
	private double value;
	public Probability(double value) throws InvalidProbabilityException {
		validate(value);
		this.value = value;
	}
	private void validate(double value) throws InvalidProbabilityException {
		if(value<0 || value>1){
			throw new InvalidProbabilityException();
		}
	}
}
