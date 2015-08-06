package minesweeper.io;

import java.util.Scanner;

import minesweeper.model.Position;

public class InputParser {
	Scanner scan;
	public InputParser() {
		scan = new Scanner(System.in);
	}
	

	public Position parse(String input) {

		String[] coords = input.split(":");
		try {

			int x = Integer.parseInt(coords[0]);
			int y = Integer.parseInt(coords[1]);
			return new Position(x, y);
		} catch (NumberFormatException ex) {
			return new Position(-1,-1);
		}
	
	}

	public Position read() {
		

		return parse(scan.next());
	}
}
