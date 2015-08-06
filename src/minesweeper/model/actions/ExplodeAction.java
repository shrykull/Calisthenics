package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Cell;
import minesweeper.model.Counter;
import minesweeper.model.Position;

public class ExplodeAction implements MineAction {

	@Override
	public void doStuff(Map<Position, Cell> cells, Position pos) {
		// TODO Fail ausgeben dein untergang war pos. tostring
		System.out.println("You suck");
		System.exit(0);
		
	}

	@Override
	public void countUp(Counter count) {
		count.countUp();
		
	}


	
}
