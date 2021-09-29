package org.self.enums;

/**
 * 
 * @author TungWang
 * @see java.lang.Enum 父类
 */
public enum BasicEnum {

	HELLO("hello"), WORLD("world");

	private String label;

	private BasicEnum(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
