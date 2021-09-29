package org.self.enums.multiple;

import java.util.Random;

/**
 * 剪刀，石头，布
 * 
 * @author TungWang
 */
public class PlayRoShamBo {

	/**
	 * a 对象与 b 对象比较的结果
	 * 
	 * @param <T> Competitor 与其子类类型
	 * @param a Competitor 实例
	 * @param b Competitor 实例
	 */
	public <T extends Competitor<T>> void match(T a, T b) {
		System.out.println(a + " vs " + b + ": " + a.compete(b));
	}

	/**
	 * @param <T> Enum 与其子类类型
	 * @param ec 枚举的 Class 对象
	 * @return 返回 ec 代表的枚举中随机的一个实例
	 */
	public <T extends Enum<T>> T randomEnum(Class<T> ec) {
		Random rand = new Random();
		T[] values = ec.getEnumConstants();
		return values[rand.nextInt(values.length)];
	}

	/**
	 * 在次数 num 内随机选择枚举 ec 的两个实例对象进行比较
	 * 
	 * @param <T> 同时实现 Enum 与 Competitor 的子类类型
	 * @param ec 枚举的 Class 对象
	 * @param num 比较的次数
	 */
	public <T extends Enum<T> & Competitor<T>> void play(Class<T> ec, int num) {
		for (int times = 0; times < num; times++)
			match(randomEnum(ec), randomEnum(ec));
	}

}
