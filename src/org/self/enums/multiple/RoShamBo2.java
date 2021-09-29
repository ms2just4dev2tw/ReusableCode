package org.self.enums.multiple;

import static org.self.enums.multiple.Outcome.DRAW;
import static org.self.enums.multiple.Outcome.LOSE;
import static org.self.enums.multiple.Outcome.WIN;

public enum RoShamBo2 implements Competitor<RoShamBo2> {

	// 布
	PAPER("布") {
		@Override
		public Outcome compete(RoShamBo2 competitor) {
			return compete(ROCK, competitor);
		}
	},
	// 剪刀
	SCISSORS("剪刀") {
		@Override
		public Outcome compete(RoShamBo2 competitor) {
			return compete(PAPER, competitor);
		}
	},
	// 石头
	ROCK("石头") {
		@Override
		public Outcome compete(RoShamBo2 competitor) {
			return compete(SCISSORS, competitor);
		}
	};

	private String label;

	private RoShamBo2(String label) {
		this.label = label;
	}

	/**
	 * @param loser this 对象对应的失败者
	 * @param competitor this 对象当前的比较对象
	 * @return 返回 this 对象与 competitor 对象比较的结果
	 */
	public Outcome compete(RoShamBo2 loser, RoShamBo2 competitor) {
		return competitor == this ? DRAW : competitor == loser ? WIN : LOSE;
	}

	@Override
	public String toString() {
		return label;
	}

}
