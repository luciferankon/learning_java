package personal.interest;

import java.util.List;

class Cells {
	private List<Cell> cells;
	private int count;

	Cells(List<Cell> cells) {
		this.cells = cells;
		this.count = 0;
	}


	Cells moveUp() {
		cells.forEach(cell -> {
			rearrange(cell, count, 3);
			count++;
		});
		generateNewCell();
		this.count = 0;
		System.out.println(this.toString());
		return this;
	}

	Cells moveDown() {
		cells.forEach(cell -> {
			rearrange(cell, count, -3);
			count++;
		});
		generateNewCell();
		this.count = 0;
		System.out.println(this.toString());
		return this;
	}

	Cells moveRight() {
		cells.forEach(cell -> {
			rearrange(cell, count, -1);
			count++;
		});
		generateNewCell();
		this.count = 0;
		System.out.println(this.toString());
		return this;
	}

	Cells moveLeft() {
		cells.forEach(cell -> {
			rearrange(cell, count, 1);
			count++;
		});
		generateNewCell();
		this.count = 0;
		System.out.println(this.toString());
		return this;
	}

	private void generateNewCell() {
		int[] numbers = {2, 4};
		int randomIndex = (int) Math.floor(Math.random() * 9);
		int randomNumber = numbers[(int) Math.floor(Math.random() * 2)];
		if (cells.get(randomIndex).getNumber() == null) {
			cells.set(randomIndex, new Cell(new Number(randomNumber)));
			return;
		}
		generateNewCell();
	}

	private void rearrange(Cell cell, int count, int delta) {
		if (count - delta < 0 || count - delta > 8) {
			cells.set(count, cell);
			return;
		}

		Cell upperCell = cells.get(count - delta);

		if (upperCell.isEqual(new Cell())) {
			cells.set(count, new Cell());
			cells.set(count - delta, cell);
			rearrange(cell, count - delta, delta);
			return;
		}
		if (upperCell.isEqual(cell)) {
			Cell newCell = upperCell.add(cell);
			cells.set(count, new Cell());
			cells.set(count - delta, newCell);
			rearrange(newCell, count - delta, delta);
		}
	}

	@Override
	public String toString() {
		return cells.toString();
	}
}
