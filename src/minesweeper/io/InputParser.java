package minesweeper.io;

import java.util.Scanner;

import minesweeper.model.Position;

public class InputParser {

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
		Scanner scan = new Scanner(System.in);

		return parse(scan.next());
	}
}
