package org.self.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class UseLambda {

	List<String> words;

	public UseLambda() {
		words = new ArrayList<>(10);
	}

	public void use() {
		Stream<String> stream = words.stream();

		// Assignment context
		Predicate<String> p = String::isEmpty;

		// Method invocation context
		stream.filter(p);

		// Cast context
		stream.map((Function<? super String, ? extends Integer>) e -> e.length());
	}

	public void func() {
		// 通过匿名类来实现函数对象
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});

		// 通过 Lambda 表达式来实现函数对象
		Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// 使用 Comparator 接口的比较器构造方法来实现函数对象
		Collections.sort(words, Comparator.comparingInt(String::length));

		// 使用 List 接口的 sort 方法简化
		words.sort(Comparator.comparingInt(String::length));
	}

}
