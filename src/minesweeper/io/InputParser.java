package minesweeper.io;

import minesweeper.model.Position;

public class InputParser {
 
	public Position parse(String input){
	 int x = input.charAt(0);
	 int y = input.charAt(1);
	 return new Position(x, y);
 }
}
