package org.self.enums.multiple;

import static org.self.enums.multiple.Outcome.DRAW;
import static org.self.enums.multiple.Outcome.LOSE;
import static org.self.enums.multiple.Outcome.WIN;

public enum RoShamBo4 implements Competitor<RoShamBo4> {
	// 布
	PAPER("布"),
	// 剪刀
	SCISSORS("剪刀"),
	// 石头
	ROCK("石头");

	private String label;
	private static Outcome[][] table = {
			// 布
			{ DRAW, LOSE, WIN },
			// 剪刀
			{ WIN, DRAW, LOSE },
			// 石头
			{ LOSE, WIN, DRAW } };

	RoShamBo4(String label) {
		this.label = label;
	}

	@Override
	public Outcome compete(RoShamBo4 competitor) {
		return table[this.ordinal()][competitor.ordinal()];
	}

	@Override
	public String toString() {
		return label;
	}

}
