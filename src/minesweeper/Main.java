package minesweeper;

import minesweeper.model.Field;

public class Main {
	public static void main(String[] args) {
		int fieldAxisLength = 10;
		
		Viewer viewer = new Viewer(fieldAxisLength);
		
		Field field = new Field(fieldAxisLength);
		field.play(viewer);
	}
}
