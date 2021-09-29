package org.self.enums.state;

import static org.self.enums.state.Input.ABORT_TRANSACTION;
import static org.self.enums.state.Input.CHIPS;
import static org.self.enums.state.Input.DIME;
import static org.self.enums.state.Input.DOLLAR;
import static org.self.enums.state.Input.NICKEL;
import static org.self.enums.state.Input.QUARTER;
import static org.self.enums.state.Input.SOAP;
import static org.self.enums.state.Input.SODA;
import static org.self.enums.state.Input.STOP;
import static org.self.enums.state.Input.TOOTHPASTE;

import java.util.EnumMap;;

public enum Category {
	// 选择交易的货币
	MONEY(NICKEL, DIME, QUARTER, DOLLAR),
	// 选择商品项目
	ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA, SOAP),
	// 离开交易
	QUIT_TRANSACTION(ABORT_TRANSACTION),
	// 停止
	SHUT_DOWN(STOP);

	private Input[] values;

	Category(Input... types) {
		values = types;
	}

	private static EnumMap<Input, Category> categories;
	static {
		categories = new EnumMap<Input, Category>(Input.class);
		// 所有的类目
		for (Category c : Category.class.getEnumConstants())
			// 每个类目下的输入 input
			for (Input type : c.values)
				categories.put(type, c);
	}

	/**
	 * @param input 输入
	 * @return 返回 input 代表的类目
	 */
	public static Category categorize(Input input) {
		return categories.get(input);
	}

}
