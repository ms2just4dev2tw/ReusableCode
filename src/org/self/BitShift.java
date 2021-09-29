package org.self;

/**
 * left shift 左移运算符 和 right shift 右移运算符的一些问题
 * 
 * @author TungWang
 */
public class BitShift {

	public void leftShift() {
		int num;
		System.out.println("左移运算符在数为正数的填充符为0");
		num = Integer.MAX_VALUE;
		System.out.println("原始     ：" + Integer.toBinaryString(num) + "\t" + num);
		int num1 = num << 1;
		System.out.println("左移1位：" + Integer.toBinaryString(num1) + "\t" + num1);
		System.out.println();

		System.out.println("左移运算符在数为负数的填充符为0");
		num = Integer.MIN_VALUE;
		System.out.println("原始     ：" + Integer.toBinaryString(num) + "\t" + num);
		int num2 = num << 1;
		System.out.println("左移1位：" + Integer.toBinaryString(num2) + "\t" + num2);
		System.out.println();

		System.out.println("一次性左移32位一定变为原始值");
		num = Integer.MIN_VALUE;
		System.out.println("原始       ：" + Integer.toBinaryString(num) + "\t" + num);
		for (int i = 32; i > 0; i--) {
			int num3 = num << i;
			System.out.println("左移" + i + "位：" + Integer.toBinaryString(num3) + "\t" + num3);
		}
		System.out.println();
		num = Integer.MIN_VALUE / 2;
		System.out.println("原始       ：" + Integer.toBinaryString(num) + "\t" + num);
		int num3 = num << 32;
		System.out.println("左移32位：" + Integer.toBinaryString(num3) + "\t" + num3);
		System.out.println();
	}

	public void rightShift() {
		int num;
		System.out.println("右移运算符在数为正数的填充符为0");
		num = Integer.MAX_VALUE;
		System.out.println("原始     ：" + Integer.toBinaryString(num) + "\t" + num);
		int num1 = num >> 1;
		System.out.println("右移1位：" + Integer.toBinaryString(num1) + "\t" + num1);
		System.out.println();

		System.out.println("右移运算符在数为负数的填充符为1");
		num = Integer.MIN_VALUE;
		System.out.println("原始     ：" + Integer.toBinaryString(num) + "\t" + num);
		int num2 = num >> 1;
		System.out.println("右移1位：" + Integer.toBinaryString(num2) + "\t" + num2);
		System.out.println();

		System.out.println("一次性右移32位一定变为原始值");
		num = -2;
		System.out.println("原始       ：" + Integer.toBinaryString(num) + "\t" + num);
		for (int i = 32; i > 0; i--) {
			int num3 = num >> i;
			System.out.println("右移" + i + "位：" + Integer.toBinaryString(num3) + "\t" + num3);
		}
		System.out.println();
		num = Integer.MIN_VALUE / 2;
		System.out.println("原始       ：" + Integer.toBinaryString(num) + "\t" + num);
		int num3 = num >> 32;
		System.out.println("右移32位：" + Integer.toBinaryString(num3) + "\t" + num3);
		System.out.println();
	}

}
