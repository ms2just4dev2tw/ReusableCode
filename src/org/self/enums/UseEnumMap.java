package org.self.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 命令模式
 * 
 * @author TungWang
 */
public class UseEnumMap {

	private enum Command {
		COPY, PASTE, CUT, INSERT, DELETE;
	}

	private interface Action {
		void action();
	}

	private EnumMap<Command, Action> em;

	public UseEnumMap() {
		em = new EnumMap<>(Command.class);
		em.put(Command.COPY, new Action() {
			@Override
			public void action() {
				System.out.println("复制");
			}
		});
		em.put(Command.PASTE, new Action() {
			@Override
			public void action() {
				System.out.println("粘贴");
			}
		});
		em.put(Command.CUT, new Action() {
			@Override
			public void action() {
				System.out.println("剪切");
			}
		});
	}

	public void use() {
		Set<Entry<Command, Action>> set = em.entrySet();
		for (Map.Entry<Command, Action> e : set) {
			System.out.print(e.getKey() + ": ");
			e.getValue().action();
		}
	}

}
