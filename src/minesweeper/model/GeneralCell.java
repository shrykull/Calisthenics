package minesweeper.model;

import java.util.Map;

public abstract class GeneralCell {
	public abstract void draw(StringBuilder builder);
	public abstract void activate(Map<Position, GeneralCell> cells, Position pos, Field field);
	public abstract void countIfBomb(Counter count);
}
