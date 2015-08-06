package minesweeper.model;

import java.util.Map;

import minesweeper.model.actions.ExplodeAction;

public class Field {
	Map<Position, GeneralCell> cells;

	public Field() {
		
	}

	public void exploreCell(Position pos) {
		cells.get(pos).activate(this.cells, pos, this);
	}
	
	public void setSymbol(Position pos, String symbol) {
		cells.put(pos, new SymbolCell(symbol));
	}
}