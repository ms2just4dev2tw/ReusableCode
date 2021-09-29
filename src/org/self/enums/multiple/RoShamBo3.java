package org.self.enums.multiple;

import static org.self.enums.multiple.Outcome.DRAW;
import static org.self.enums.multiple.Outcome.LOSE;
import static org.self.enums.multiple.Outcome.WIN;

import java.util.EnumMap;

public enum RoShamBo3 implements Competitor<RoShamBo3> {
	// 布
	PAPER("布"),
	// 剪刀
	SCISSORS("剪刀"),
	// 石头
	ROCK("石头");

	private static EnumMap<RoShamBo3, EnumMap<RoShamBo3, Outcome>> table;
	//
	static {
		table = new EnumMap<>(RoShamBo3.class);
		initRow(PAPER, DRAW, LOSE, WIN);
		initRow(SCISSORS, WIN, DRAW, LOSE);
		initRow(ROCK, LOSE, WIN, DRAW);
	}

	private static void initRow(RoShamBo3 it, Outcome vsPaper, Outcome vsScissors, Outcome vsRock) {
		EnumMap<RoShamBo3, Outcome> row = new EnumMap<>(RoShamBo3.class);
		table.put(it, row);
		row.put(PAPER, vsPaper);
		row.put(SCISSORS, vsScissors);
		row.put(ROCK, vsRock);
	}

	private String label;

	RoShamBo3(String label) {
		this.label = label;
	}

	@Override
	public Outcome compete(RoShamBo3 competitor) {
		return table.get(this).get(competitor);
	}

	@Override
	public String toString() {
		return label;
	}

}
