package minesweeper.model;

import java.util.HashMap;
import java.util.Map;

import minesweeper.Viewer;
import minesweeper.io.InputParser;

//TODO: shorten this class to fit 50 lines max
public class Field {
	Map<Position, GeneralCell> cells;

	public Field(int fieldAxisLength) {
		cells = new HashMap<Position, GeneralCell>();
		int fieldsize = fieldAxisLength;
		int qfieldsize = fieldsize * fieldsize; // quadratisch machen
		for (int i = 0; i < qfieldsize; i++) {
			int x = (int) Math.floor(i / fieldsize);
			int y = i % fieldsize;
			cells.put(new Position(x, y), new PotentialMineCell());
		}
	}

	public void exploreCell(Position pos) {
		GeneralCell cell = cells.get(pos);
		if (cell != null) {
			cell.activate(this.cells, pos, this);
		}
	}

	public void setSymbol(Position pos, String symbol) {
		cells.put(pos, new SymbolCell(symbol));
	}

	public void play(Viewer viewer) {
		InputParser pars = new InputParser();

		while (!fieldEnded()) {
			this.print(viewer);
			System.out.println("DO YOUR WORST");

			this.exploreCell(pars.read());
		}
		this.print(viewer);
		System.out.println("You Won");
	}
	
	public boolean fieldEnded() {
		for (GeneralCell cell : cells.values()) {
			if (cell instanceof PotentialMineCell) {
				Counter counter = new Counter();
				cell.countIfBomb(counter);
				if (counter.counterSymbol().equals("0"))
					return false; //TODO: stop violating the indentation rule
			}
		}
		return true;
	}

	public void print(Viewer viewer) {
		StringBuilder builder = new StringBuilder();
		int fieldsize = (int)Math.sqrt(cells.values().size()); 
		for (int i = 0; i < cells.values().size(); ++i) {
			cells.get(new Position(i % fieldsize, (int)Math.floor(i / fieldsize))).draw(builder);
		}
		viewer.printField(builder);
	}
}