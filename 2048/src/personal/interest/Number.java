package personal.interest;

class Number {
	private int number;

	Number(int number) {
		this.number = number;
	}

	static Number createNumber(int number) throws InvalidNumberException {
		validate(number);
		return new Number(number);
	}

	private static void validate(int number) throws InvalidNumberException {
		if (isNotPowerOfTwo(number)) throw new InvalidNumberException();
	}

	private static boolean isNotPowerOfTwo(int number) {
		return (int) (Math.ceil((Math.log(number) / Math.log(2)))) != (int) (Math.floor(((Math.log(number) / Math.log(2)))));
	}

	Number add(Number number) {
		return new Number(number.number + this.number);
	}

	@Override
	public String toString() {
		return number + "";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Number number1 = (Number) o;
		return number == number1.number;
	}
}
