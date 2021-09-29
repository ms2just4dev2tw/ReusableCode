package org.self.enums;

import java.util.Random;

public class Mail {

	// 存局候领邮件
	enum GeneralDelivery {
		// 当前邮件是一件存局候领邮件
		YES,
		//
		NO1, NO2, NO3, NO4, NO5;

		@Override
		public String toString() {
			return name();
		}
	}

	// 邮件的可扫描性
	enum Scannability {
		// 不能扫描
		UNSCANNABLE,
		//
		YES1, YES2, YES3, YES4;

		@Override
		public String toString() {
			return name();
		}
	}

	// 邮件的可读性
	enum Readability {
		// 难以辨认的邮件
		ILLEGIBLE,
		//
		YES1, YES2, YES3, YES4;

		@Override
		public String toString() {
			return name();
		}
	}

	// 地址
	enum Destination {
		// 不正确的地址
		INCORRECT,
		//
		OK1, OK2, OK3, OK4, OK5, OK6;

		@Override
		public String toString() {
			return name();
		}
	}

	// 邮件的来源地址
	enum Source {
		// 缺失的地址
		MISSING,
		//
		OK1, OK2, OK3, OK4, OK5;

		@Override
		public String toString() {
			return name();
		}
	}

	Source source;
	Destination destination;
	Readability readability;
	Scannability scannability;
	GeneralDelivery generalDelivery;

	private static long counter = 0;
	private long id = counter++;

	@Override
	public String toString() {
		return "[Mail: " + id + "]";
	}

	public String details() {
		StringBuilder sb = new StringBuilder();
		sb.append(toString());
		sb.append(", 存局候领邮件: ").append(generalDelivery);
		sb.append(", 地址扫描: ").append(scannability);
		sb.append(", 人工辨认地址: ").append(readability);
		sb.append(", 目的地址: ").append(destination);
		sb.append(", 源地址: ").append(source);
		return sb.toString();
	}

	// Generate test Mail:
	public static Mail randomMail() {
		Mail m = new Mail();
		m.source = randomEnum(Source.class);
		m.destination = randomEnum(Destination.class);
		m.readability = randomEnum(Readability.class);
		m.scannability = randomEnum(Scannability.class);
		m.generalDelivery = randomEnum(GeneralDelivery.class);
		return m;
	}

	/**
	 * @param <T> Enum 与其子类类型
	 * @param ec 枚举的 Class 对象
	 * @return 返回 ec 代表的枚举中随机的一个实例
	 */
	private static <T extends Enum<T>> T randomEnum(Class<T> ec) {
		Random rand = new Random();
		T[] values = ec.getEnumConstants();
		return values[rand.nextInt(values.length)];
	}

}
