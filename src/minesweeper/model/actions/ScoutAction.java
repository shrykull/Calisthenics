package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Cell;
import minesweeper.model.Counter;
import minesweeper.model.Position;

public class ScoutAction implements MineAction {

	@Override
	public void doStuff(Map<Position, Cell> cells, Position pos) {
		Counter count = new Counter();
		cells.get(pos.getLeft()).countIfBomb(count);
		cells.get(pos.getTopLeft()).countIfBomb(count);
		cells.get(pos.getTopLeft()).countIfBomb(count);
		cells.get(pos.getTopRight()).countIfBomb(count);
		cells.get(pos.getRight()).countIfBomb(count);
		cells.get(pos.getBottomRight()).countIfBomb(count);
		cells.get(pos.getBottom()).countIfBomb(count);
		cells.get(pos.getBottomLeft()).countIfBomb(count);
		count.getCounterSymbol();


	}

	@Override
	public void countUp(Counter count) {
		// fuck it

	}

}
