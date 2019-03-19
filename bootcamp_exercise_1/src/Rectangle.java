public class Rectangle {
	private final Dimension height;
	private final Dimension width;

	Rectangle(Dimension height, Dimension width) {
		this.height = height;
		this.width = width;
	}

	public double calculateArea() {
		return this.height.getValue() * this.width.getValue();
	}

	public double calculatePerimeter() {
		return 2 * (this.width.getValue() + this.height.getValue());
	}
}
