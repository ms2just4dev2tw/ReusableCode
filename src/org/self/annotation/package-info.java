/**
 * <h2>注解</h2>
 * 
 * <h3>注解的元注解</h3>
 * <ul>
 * 		<li>{@link java.lang.annotation.Target 表明注解可以用于什么地方} <p>
 * 		{@link java.lang.annotation.ElementType ElementType} 可能的参数
 * 		<ul>
 * 			<li>CONSTRUCTOR 构造器的声明</li>
 * 			<li>FIELD 域的声明(包括枚举的实例)</li>
 * 			<li>LOCAL_VARIABLE 局部变量的声明</li>
 * 			<li>METHOD 方法的声明</li>
 * 			<li>PACKAGE 包的声明</li>
 * 			<li>PARAMETER 参数的声明</li>
 * 			<li>TYPE 类(包括枚举)，接口(包括注解) 的声明</li>
 * 			<li>ANNOTATION_TYPE 注解类型的声明</li>
 * 			<li>TYPE_PARAMETER 类型参数的声明</li>
 * 			<li>MODULE 模块的声明</li>
 * 		</ul></li>
 * 		<li>{@link java.lang.annotation.Retention 表示在什么级别保存该注解信息} <p>
 * 		{@link java.lang.annotation.RetentionPolicy RetentionPolicy} 的可选参数
 * 		<ul>
 * 			<li>SOURCE 注解将被编译器丢弃</li>
 * 			<li>CLASS 注解在 class 文件中可用，但在运行时会被 VM 丢弃</li>
 * 			<li>RUNTIME 运行时也保存注解，因此可以通过反射机制读取该注解的信息</li>
 * 		</ul></li>
 * 		<li>{@link java.lang.annotation.Documented 将此注解包含在 Javadoc 中} </li>
 * 		<li>{@link java.lang.annotation.Inherited 允许子类继承父类的注解} </li>
 * 		<li>{@link java.lang.annotation.Repeatable 表示注解的值可以同时取多个}<li>
 * </ul>
 * 
 * <h3>注解元素</h3>
 * <ul>
 * 		<li>所有的基本类型</li>
 * 		<li>{@link java.lang.String String} </li>
 * 		<li>{@link java.lang.Class Class} </li>
 * 		<li>{@link java.lang.Enum enum} </li>
 * 		<li>{@link java.lang.annotation.Annotation Annotation} </li>
 * 		<li>以上类型的数组</li>
 * 		<li></li>
 * 		<li></li>
 * </ul>
 */
package org.self.annotation;
