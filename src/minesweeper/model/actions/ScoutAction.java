package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Counter;
import minesweeper.model.Field;
import minesweeper.model.GeneralCell;
import minesweeper.model.Position;

public class ScoutAction implements MineAction {

	@Override
	public void doStuff(Map<Position, GeneralCell> cells, Position pos, Field field) {
		Counter count = new Counter();
		GeneralCell tempCell = cells.get(pos.getLeft());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}

		tempCell = cells.get(pos.getTopLeft());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getTop());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getTopRight());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getRight());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getBottomRight());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getBottom());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}
		tempCell = cells.get(pos.getBottomLeft());
		if (tempCell != null) {
			tempCell.countIfBomb(count);
		}//TODO: rekursiv weiterlaufen lassen?
		field.setSymbol(pos, count.counterSymbol());
	}

	@Override
	public void countUp(Counter count) {
		// fuck it

	}

}
