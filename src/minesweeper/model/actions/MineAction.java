package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Counter;
import minesweeper.model.Field;
import minesweeper.model.GeneralCell;
import minesweeper.model.Position;

public interface MineAction {
	public void doStuff(Map<Position, GeneralCell> cells, Position pos, Field field);
	public void countUp(Counter count);
}
