package minesweeper.model.actions;

import java.util.Map;

import minesweeper.model.Counter;
import minesweeper.model.Field;
import minesweeper.model.GeneralCell;
import minesweeper.model.Position;

public class ExplodeAction implements MineAction {

	@Override
	public void doStuff(Map<Position, GeneralCell> cells, Position pos, Field field) {
		
		System.out.println("You suck");
		System.exit(0);
		
	}

	@Override
	public void countUp(Counter count) {
		count.countUp();
		
	}


	
}
