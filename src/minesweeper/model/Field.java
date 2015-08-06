package minesweeper.model;

import java.util.Map;

import minesweeper.io.InputParser;

public class Field {
	Map<Position, GeneralCell> cells;

	public Field() {
		int fieldsize = 3;
		int qfieldsize = fieldsize * fieldsize; //quadratisch machen
		for (int i = 0; i < qfieldsize;i++) {
			int x = (int)Math.floor(i / fieldsize);
			int y = i % fieldsize;
			cells.put(new Position(x, y), new PotentialMineCell());
		}
	}

	public void exploreCell(Position pos) {
		cells.get(pos).activate(this.cells, pos, this);
	}
	
	public void setSymbol(Position pos, String symbol) {
		cells.put(pos, new SymbolCell(symbol));
	}
	
	public void play(){
		InputParser pars = new InputParser();
		
		while(true){
			this.exploreCell(pars.read());
		}
	}
}