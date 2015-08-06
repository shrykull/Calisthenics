package minesweeper.io;

import java.util.Scanner;

import minesweeper.model.Position;

public class InputParser {

	public Position parse(String input) {

		String[] coords = input.split(":");
		int x = Integer.parseInt(coords[0]);
		int y = Integer.parseInt(coords[1]);
		return new Position(x, y);
	}
	
	public Position read(){
		Scanner scan = new Scanner(System.in);
		
		return parse(scan.next());
	}
}
