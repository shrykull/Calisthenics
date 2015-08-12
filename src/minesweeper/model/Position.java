package minesweeper.model;

//TODO: shorten this class to fit 50 lines max
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
	
	@Override
	public String toString() {
		return "" + x + y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
