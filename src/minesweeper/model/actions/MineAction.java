package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Cell;
import minesweeper.model.Counter;
import minesweeper.model.Position;

public interface MineAction {
	public void doStuff(Map<Position,Cell> cells, Position pos);
	public void countUp(Counter count);
}
