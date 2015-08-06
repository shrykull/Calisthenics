package minesweeper.model;

import java.util.Map;

public class SymbolCell extends GeneralCell {
	String symbol;

	public SymbolCell(String s) {
		this.symbol = s;
	}

	@Override
	public void draw(StringBuilder builder) {
		builder.append(symbol);
	}

	@Override
	public void activate(Map<Position, GeneralCell> cells, Position pos, Field field) {
		// fuck it
	}

	@Override
	public void countIfBomb(Counter count) {
		//fuck it
	}
}
