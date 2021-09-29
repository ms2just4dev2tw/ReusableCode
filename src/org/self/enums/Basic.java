package org.self.enums;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Basic {

	public <T extends Enum<T>> void foreach(Class<T> ec) {
		for (T en : ec.getEnumConstants()) {
			System.out.println(en + "Ordinal" + en.ordinal());
			System.out.println(en.getDeclaringClass());
			System.out.println(en.name());
		}
	}

	public void enumSwitch(BasicEnum be) {
		switch (be) {
		default:
		case HELLO:
			System.out.println(BasicEnum.HELLO);
			break;
		case WORLD:
			System.out.println(BasicEnum.WORLD);
			break;
		}
	}

	public Set<String> analyzeEnum(Class<?> enumClass) {
		System.out.println("======= Analyzing " + enumClass + " ======");
		System.out.println("Interfaces: ");
		for (Type t : enumClass.getGenericInterfaces())
			System.out.println(t);
		System.out.println("Base: ");
		System.out.println(enumClass.getSuperclass());
		System.out.println("Methods: ");
		Set<String> methods = new TreeSet<>();
		for (Method m : enumClass.getMethods())
			methods.add(m.getName());
		System.out.println(methods);
		return methods;
	}

	public <T extends Enum<T>> T randomEnum(Class<T> ec) {
		Random rand = new Random();
		T[] values = ec.getEnumConstants();
		return values[rand.nextInt(values.length)];
	}

}
