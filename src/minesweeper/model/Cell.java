package minesweeper.model;

import java.util.Map;

import minesweeper.model.actions.MineAction;



public class Cell {
	
	MineAction action;
	
	
	public Cell() {
		super();
	}


	public void activate(Map<Position,Cell> cells ,Position pos) {
		action.doStuff(cells, pos);
	}
	
	public void countIfBomb(Counter count){
		action.countUp(count);
	}
}
