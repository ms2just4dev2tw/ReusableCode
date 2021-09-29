/**
 * <h2>注解处理器</h2>
 * 根据 Retention 的级别区分处理器的分类
 * <ul>
 * 		<li>SOURCE，一般是为编译器提供信息<li>
 * 		<li>CLASS，编译时处理器 <p>
 * 		通过继承抽象类 AbstractProcessor 来做注解处理器<li>
 * 		<li>RUNTIME，运行时处理器 <p>
 * 		通常通过反射机制来做注解处理器<li>
 * </ul>
 * 
 * <h3>命令行编译源文件</h3>
 * -encoding UTF-8	指定源文件使用的字符编码
 * <p>
 * -classpath ../lib/xxx.jar  指定查找用户类文件和注释处理程序的位置
 * <p>
 * -d ../bin/src	指定放置生成的类文件的位置，必须存在
 * <p>
 * org/self/annotation/xxx.java	带包路径的源文件
 * <p>
 * 
 * javac -encoding UTF-8 -classpath ../lib/AnnotationProcessorTest-0.0.1-SNAPSHOT.jar -d ../bin/src org/self/annotation/apt/A.java
 */
package org.self.annotation.apt;
