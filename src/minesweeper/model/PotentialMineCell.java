package minesweeper.model;

import java.util.Map;

import minesweeper.model.actions.ExplodeAction;
import minesweeper.model.actions.MineAction;
import minesweeper.model.actions.ScoutAction;

public class PotentialMineCell extends GeneralCell {
	
	MineAction action;
	
	
	public PotentialMineCell() {
		super();
		this.action = randomAction();
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
	
	private MineAction randomAction() {
		int chance = 10;
		if (Math.random() * 100 < chance) {
			return new ExplodeAction();
		}
		return new ScoutAction();
	} 
}
