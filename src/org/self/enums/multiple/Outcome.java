package org.self.enums.multiple;

/**
 * 剪刀，石头，布的结果
 * 
 * @author TungWang
 */
public enum Outcome {

	WIN("赢"), LOSE("输"), DRAW("平局");

	private String label;

	private Outcome(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return label;
	}

}
