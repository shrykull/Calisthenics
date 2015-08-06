package minesweeper.model;

public class Cell {
	boolean hasMine;
	Position pos;
	
	public boolean explode(Position pos){
		return false;
	}
}
