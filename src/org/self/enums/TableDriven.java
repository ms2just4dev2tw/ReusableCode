package org.self.enums;

/**
 * 表驱动
 * 
 * @author TungWang
 */
public class TableDriven {

	public static enum Command {
		COPY {
			@Override
			public void action() {
				System.out.println("复制");
			};

			@Override
			public String toString() {
				return "COPY change Method-toString";
			}
		},
		PASTE {
			@Override
			public void action() {
				System.out.println("粘贴");
			};

			@Override
			public String toString() {
				return "PASTE change Method-toString";
			}
		},
		CUT {
			@Override
			public void action() {
				System.out.println("剪贴");
			};

			@Override
			public String toString() {
				return "CUT change Method-toString";
			}
		},
		INSERT {
			@Override
			public void action() {
				System.out.println("插入");
			}
		},
		DELETE {
			@Override
			public void action() {
				System.out.println("删除");
			}
		};

		/**
		 * Enum 的抽象方法
		 */
		public abstract void action();

		// 覆写 Enum 的方法
		@Override
		public String toString() {
			return "Default Method-toString";
		}
	}

	public void command(Command command) {
		System.out.println(command + ":");
		command.action();
	}

}
