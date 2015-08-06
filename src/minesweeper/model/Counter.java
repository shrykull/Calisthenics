package minesweeper.model;

public class Counter {
	int count = 0;
	public void countUp() {
		count++;
	}
	
	public String counterSymbol(){
		return String.valueOf(count);
	}
}
