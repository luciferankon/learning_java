package personal.interest;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws InvalidNumberException {
		Cell cell1 = new Cell();
		Cell cell2 = new Cell(Number.createNumber(2));
		Cell cell3 = new Cell();
		Cell cell4 = new Cell();
		Cell cell5 = new Cell();
		Cell cell6 = new Cell();
		Cell cell7 = new Cell(Number.createNumber(4));
		Cell cell8 = new Cell();
		Cell cell9 = new Cell();

		Cells cells = new Cells(new ArrayList<>(List.of(cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9)));

		cells.moveUp().moveDown().moveRight().moveLeft();

	}
}
