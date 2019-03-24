package personal.interest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CellsTest {

	@Test
	void shouldMoveTheCellsUp() throws InvalidNumberException {
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
		Cells rearrangedCells = new Cells(List.of(cell7, cell2, cell3, cell4, cell2, cell6, cell1, cell8, cell9));

		Cells actual = cells.moveUp().moveDown().moveRight().moveLeft().moveRight().moveRight().moveRight();
		assertEquals(rearrangedCells, actual);

	}
}