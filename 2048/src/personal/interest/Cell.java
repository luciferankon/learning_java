package personal.interest;

class Cell {

	private Number number;

	Cell(Number number) {
		this.number = number;
	}

	Cell() {
	}

	Number getNumber() {
		return number;
	}

	Cell add(Cell cell) {
		return new Cell(this.number.add(cell.number));
	}

	@Override
	public String toString() {
		return number + "";
	}

	boolean isEqual(Cell cell) {
		return this.equals(cell);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cell cell = (Cell) o;
		if (number == null && cell.number == null) return true;
		if (number == null || cell.number == null) return false;
		return number.equals(cell.number);
	}

}
