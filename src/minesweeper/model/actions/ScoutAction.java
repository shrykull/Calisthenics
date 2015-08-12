package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Counter;
import minesweeper.model.Field;
import minesweeper.model.GeneralCell;
import minesweeper.model.Position;

//TODO: shorten this class to fit 50 lines max
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
		}
		field.setSymbol(pos, count.counterSymbol());
		if (count.counterSymbol().equals("0")) {
			//rekursiv weiterlaufen lassen. diagonale egal weil wird ja eh schon countUp()ed
			field.exploreCell(pos.getBottom());
			field.exploreCell(pos.getRight());
			field.exploreCell(pos.getTop());
			field.exploreCell(pos.getLeft());
		}
	}

	@Override
	public void countUp(Counter count) {
		// fuck it
	}

}
