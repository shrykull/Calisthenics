package minesweeper.model;

public class Position {
	private int x, y;

	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Position getLeft() {
		return new Position(this.x - 1, y);
	}

	public Position getTopLeft() {
		return new Position(this.x - 1, y - 1);
	}

	public Position getTop() {
		return new Position(this.x, y - 1);
	}

	public Position getTopRight() {
		return new Position(this.x + 1, y - 1);
	}

	public Position getRight() {
		return new Position(this.x + 1, y);
	}

	public Position getBottomRight() {
		return new Position(this.x + 1, y + 1);
	}

	public Position getBottom() {
		return new Position(this.x, y + 1);
	}

	public Position getBottomLeft() {
		return new Position(this.x - 1, y + 1);
	}
}