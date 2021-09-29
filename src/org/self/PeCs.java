package org.self;

import java.util.Collection;
import java.util.Stack;

/**
 * 
 * Pe：producer-extends，生产者使用继承关键字extends
 * 
 * Cs：consumer-super，消费者使用超类关键字super
 * 
 * List<Object>不是List<Integer>的父类，它们都是List的子类型
 * 
 * @author wh136
 * @param <E>
 *
 */
public class PeCs {

	public static class MyStack<E> extends Stack<E> {

		private static final long serialVersionUID = 4269538155481921790L;

		// 消费者
		public void pushAll_My(Iterable<E> src) {
			for (E e : src)
				push(e);
		}

		// 消费者
		public void pushAll_My_E(Iterable<? extends E> src) {
			for (E e : src)
				push(e);
		}

		// 生产者
		public void popAll_My(Collection<E> dst) {
			while (isEmpty()) {
				dst.add(pop());
			}
		}

		// 生产者
		public void popAll_My_S(Collection<? super E> dst) {
			while (isEmpty()) {
				dst.add(pop());
			}
		}
	}

}
