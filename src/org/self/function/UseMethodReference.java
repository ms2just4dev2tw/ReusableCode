package org.self.function;

import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class UseMethodReference {

	public UseMethodReference() {
	}

	public void use() {
		// 静态方法引用
		ToIntFunction<String> toInt = Integer::parseInt;
		//
		toInt = str -> Integer.parseInt(str);

		// 有限制的方法引用
		Predicate<Instant> toBool = Instant.now()::isAfter;
		//
		Instant then = Instant.now();
		toBool = t -> then.isAfter(t);

		// 无限制的方法引用
		UnaryOperator<String> strOpt = String::toLowerCase;
		//
		strOpt = str -> str.toLowerCase();

		// 类构造器的方法引用
		Supplier<Map<String, String>> map = TreeMap<String, String>::new;
		//
		map = () -> new TreeMap<>();

		// 数组构造器的方法引用
		IntFunction<int[]> arr = int[]::new;
		//
		arr = len -> new int[len];
	}

}
