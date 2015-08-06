package minesweeper.model;

import java.util.Map;

import minesweeper.model.actions.MineAction;



public class PotentialMineCell extends GeneralCell {
	
	MineAction action;
	
	
	public PotentialMineCell() {
		super();
	}


	public void activate(Map<Position, GeneralCell> cells, Position pos, Field field) {
		action.doStuff(cells, pos, field);
	}
	
	public void countIfBomb(Counter count){
		action.countUp(count);
	}


	@Override
	public void draw(StringBuilder builder) {
		builder.append("#");
	}
}
