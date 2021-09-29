package org.self.enums.state;

import java.util.Random;

public enum Input {
	// 五分钱，一角钱，两角五分钱，一美元
	NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100),
	// 牙膏，薯片，苏打水，肥皂
	TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50),
	// 中止交易
	ABORT_TRANSACTION {
		@Override
		public int amount() {
			throw new RuntimeException("ABORT_TRANSACTION.amount()");
		}
	},
	// 这个实例必须定义在最后
	STOP {
		@Override
		public int amount() {
			throw new RuntimeException("STOP.amount()");
		}
	};

	// 价值
	private int value;

	Input() {
	}

	Input(int value) {
		this.value = value;
	}

	// input 代表的价值
	public int amount() {
		return value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[").append(name());
		if (this != ABORT_TRANSACTION && this != STOP)
			sb.append(": ").append(amount());
		sb.append("]");
		return sb.toString();
	}

	/**
	 * @return 随机产生一个输入
	 */
	public static Input randInput() {
		Random rand = new Random();
		Input[] enums = values();
		return enums[rand.nextInt(enums.length)];
	}

}
