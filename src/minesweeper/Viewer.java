package minesweeper;

public class Viewer {
	int fieldAxisLength;
	public Viewer(int length) {
		this.fieldAxisLength = length;
	}

	public void printField(StringBuilder builder) {
		String fieldString = builder.toString();
		for (int line = 0; line < fieldString.length() / fieldAxisLength; line++) {
			int begin = line * fieldAxisLength;
			int end = begin + fieldAxisLength;
			System.out.println(fieldString.substring(begin, end));
		}
	}
}
