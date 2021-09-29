package org.self.enums.multiple;

import static org.self.enums.multiple.Outcome.DRAW;
import static org.self.enums.multiple.Outcome.LOSE;
import static org.self.enums.multiple.Outcome.WIN;

public enum RoShamBo1 implements Competitor<RoShamBo1> {
	// 布
	PAPER("布", DRAW, LOSE, WIN),
	// 剪刀
	SCISSORS("剪刀", WIN, DRAW, LOSE),
	// 石头
	ROCK("石头", LOSE, WIN, DRAW);

	private String label;
	// 与每种情况比较的结果
	private Outcome vsPaper, vsScissors, vsRock;

	RoShamBo1(String label, Outcome vsPaper, Outcome vsScissors, Outcome vsRock) {
		this.label = label;
		this.vsPaper = vsPaper;
		this.vsScissors = vsScissors;
		this.vsRock = vsRock;
	}

	@Override
	public Outcome compete(RoShamBo1 competitor) {
		switch (competitor) {
		default:
		case PAPER:
			return vsPaper;
		case SCISSORS:
			return vsScissors;
		case ROCK:
			return vsRock;
		}
	}

	@Override
	public String toString() {
		return label;
	}

}
