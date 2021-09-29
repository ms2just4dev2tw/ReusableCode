package org.self.enums;

import java.util.EnumSet;

/**
 * 
 * @author TungWang
 * @see EnumSet#noneOf(Class) 小于等于一个长整型使用 RegularEnumSet，否额JumboEnumSet
 */
public class UseEnumSet {

	public <T extends Enum<T>> void use(Class<T> ec) {
		EnumSet<?> set = EnumSet.noneOf(ec);
		System.out.println(set);
		set.add(null);
		System.out.println(set);
		set.addAll(EnumSet.of(null, null, null, null, null));
		System.out.println(set);
	}

}
