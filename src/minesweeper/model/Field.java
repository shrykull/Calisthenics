package minesweeper.model;

import java.util.Map;

import minesweeper.model.actions.ExplodeAction;

public class Field {
	Map<Position, Cell> cells;

	public Field() {
		
	}
	
	

	public void exploreCell(Position pos) {
		cells.get(pos).activate(this.cells,pos);
	}
}