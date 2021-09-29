/**
 * <h2>所有异常和错误的超类</h2>
 * {@link java.lang.Throwable}
 * 
 * <h3>编译时错误和系统错误</h3>
 * {@link java.lang.Error 它们通常是灾难性的致命错误，不是程序可以控制的}
 * 
 * <h3>用户程序可能出现的异常情况</h3>
 * {@link java.lang.Exception 所有异常的超类}
 * <p>
 * 异常主要分为两类：
 * <ul>
 * 		<li>1，{@link java.lang.RuntimeException 运行时异常，也称为不检查异常} <p>
 * 		这些异常一般由程序逻辑错误引起，程序应该从逻辑角度尽可能避免这类异常的发生。</li>
 * 		<li>2，非运行时异常，也称检查异常<p> 
 * 		从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。</li>
 * </ul>
 * 
 * <h3>常见的运行时异常</h3>
 * <ul>
 * 		<li>{@link java.lang.NullPointerException 空指针异常} <p>
 * 		</li>
 * 		<li>{@link java.lang.ArithmeticException 算术错误异常} <p>
 * 		如以零做除数</li>
 * 		<li>{@link java.lang.ArrayIndexOutOfBoundsException 数组索引越界} <p> 
 * 		</li>
 * 		<li>{@link java.lang.IndexOutOfBoundsException 某种类型的索引越界} <p> 
 * 		</li>
 * 		<li>{@link java.lang.NegativeArraySizeException 在负数范围内创建的数组} <p> 
 * 		</li>
 * 		<li>{@link java.lang.ClassCastException 类型转换异常} <p> 
 * 		</li>
 * 		<li>{@link java.lang.ArrayStoreException 向类型不兼容的数组元素赋值} <p>
 * 		</li>
 * 		<li>{@link java.lang.TypeNotPresentException	类型未找到异常} <p> 
 * 		</li>
 * 		<li>{@link java.lang.IllegalArgumentException 使用非法实参调用方法} <p>
 * 		</li>
 * 		<li>{@link java.lang.lIIegalStateException 环境或应用程序处于不正确的状态} <p> 
 * 		</li>
 * 		<li>{@link java.lang.IllegalThreadStateException 请求的操作与当前线程状态不兼容} <p>
 * 		</li>
 * 		<li>{@link java.lang.NumberFormatException 数字转化格式异常} <p>
 * 		比如字符串到 float 型数字的转换无效</li>
 * 
 * </ul>
 * 
 * <h3>常见的非运行时异常</h3>
 * <ul>
 * 		<li>{@link java.io.IOException 输入/输出异常 } <p>
 * 		</li>
 * 		<li>{@link java.lang.ClassNotFoundException 类文件不存在异常} <p> 
 * 		</li>
 * 		<li>{@link java.lang.IllegalAccessException 类非法访问异常 } <p>
 * 		</li>
 * 		<li>{@link java.lang.InstantiationException 实例化异常} <p> 
 * 		试图创建抽象类或接口的对象</li>
 * 		<li>{@link java.lang.InterruptedException 中断异常 } <p>
 * 		线程被另一个线程中断</li>
 * 		<li>{@link java.lang.NoSuchFieldException 访问域不存在异常} <p> 
 * 		请求的域不存在</li>
 * 		<li>{@link java.lang.NoSuchMethodException 访问方法不存在异常 } <p>
 * 		请求的方法不存在</li>
 * 		<li>{@link ReflectiveOperationException 反射操作异常} <p> 
 * 		与反射有关的异常的超类</li>
 * </ul>
 */
package org.self.exception;
