package org.self.enums.state;

/**
 * 自动售货机
 * 
 * @author TungWang
 */
public class VendingMachine {

	// 售货机拥有的货币
	private static int amount = 0;
	// 选择的物品
	private static Input item;
	// 售货机的状态
	private static State state = State.RESTING;

	enum State {
		// 售货机的初始状态
		RESTING(false) {
			@Override
			void nextState(Input input) {
				switch (Category.categorize(input)) {
				case MONEY:
					amount += input.amount();
					state = ADDING_MONEY;
					break;
				case SHUT_DOWN:
					state = TERMINAL;
					break;
				default:
					System.out.println("[State: " + state + "] Invalid Input " + input);
				}
			}
		},
		// 售货机已经投入了硬币
		ADDING_MONEY(false) {
			@Override
			void nextState(Input input) {
				switch (Category.categorize(input)) {
				case MONEY:
					amount += input.amount();
					break;
				case ITEM_SELECTION:
					item = input;
					if (amount < item.amount())
						System.out.println("have no enough money pay for " + item);
					else
						state = DISPENSING;
					break;
				case QUIT_TRANSACTION:
					state = GIVING_CHANGE;
					break;
				default:
					System.out.println("[State: " + state + "] Invalid Input " + input);
				}
			}
		},
		// 售货机发放用户选择的商品
		DISPENSING(true) {
			@Override
			void nextState() {
				System.out.println("here is your " + item);
				amount -= item.amount();
				// 还有钱就进入售货状态，否则进入初始状态
				state = amount > 0 ? ADDING_MONEY : RESTING;
			}
		},
		// 售货机退钱
		GIVING_CHANGE(true) {
			@Override
			void nextState() {
				if (amount > 0) {
					System.out.println("Your change: " + amount);
					amount = 0;
				}
				state = RESTING;
			}
		},
		// 终止状态
		TERMINAL(false) {
			@Override
			void printState() {
				System.out.println("System Halted");
			}
		};

		// 瞬时状态的标记
		private boolean transientState;

		State(boolean transientState) {
			this.transientState = transientState;
		}

		/**
		 * 只能由处于非瞬时的状态调用
		 * 
		 * @param input
		 */
		void nextState(Input input) {
			throw new RuntimeException("Only call " + "it for non-transient states");
		}

		/**
		 * 只能由处于瞬时的状态调用
		 */
		void nextState() {
			throw new RuntimeException("Only call it for " + "StateDuration.TRANSIENT states");
		}

		void printState() {
			System.out.println("Money: " + amount);
		}
	}

	/**
	 * 根据生成器产生的输入 input 来运行
	 * 
	 * @param gen 输入 input 生成器
	 */
	public static void run(Generator<Input> gen) {
		while (state != State.TERMINAL) {
			Input input = gen.next();
			state.nextState(input);
			// 当前状态是一个瞬时状态
			while (state.transientState)
				state.nextState();
			// 打印当前状态持有的钱，或者打印结束状态
			state.printState();
		}
	}

}
