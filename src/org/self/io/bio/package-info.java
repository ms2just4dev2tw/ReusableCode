/**
 * <h2>JDK 1.0 - 1.3 使用的同步阻塞模式</h2>
 * 
 * <h3>InputStream</h3>
 * 1，表示从不同数据源产生输入的字节流
 * <ul>
 * 		<li>{@link java.io.InputStream 抽象的输入数据源} </li>
 * 		<li>{@link java.io.ByteArrayInputStream 内存缓冲区作为数据源}</li>
 * 		<li>{@link java.io.StringBufferInputStream 使用 StringBuffer 作为数据源}</li>
 * 		<li>{@link java.io.FileInputStream 文件的相关信息作为数据源}</li>
 * 		<li>{@link java.io.PipedInputStream 从管道中读取字节，管道作为数据源} <p>
 * 		同 PipedOutputStream 绑定于一个管道，在多线程中使用</li>
 * 		<li>{@link java.io.SequenceInputStream 多个 InputStream 作为数据源} <p>
 * 		包含两个 InputStream 或者是一个容纳 InputStream 对象的 Enumeration 容器</li>
 * </ul>
 * 
 * 2，对数据源 InputStream 装饰强化功能的字节流 
 * <ul>
 * 		<li>{@link java.io.FilterInputStream 基础的装饰输入数据源}</li>
 * 		<li>{@link java.io.DataInputStream 从字节流中读取基础类型数据}</li>
 * 		<li>{@link java.io.BufferedInputStream 使用缓冲区来缓存读取到的字节}</li>
 * 		<li>{@link java.io.LineNumberInputStream 跟踪字节流中的行号} <p>
 * 		setLineNumber(int) 和 getLineNumber()</li>
 * 		<li>{@link java.io.PushbackInputStream 支持回退字节操作} <p>
 * 		unread(int) 回退读取的一个字节，该字节流内部的回退缓冲区是从右至左填充数据</li>
 * </ul>
 * 
 * <h3>OutputStream</h3>
 * 1，表示字节流的不同目标
 * <ul>
 * 		<li>{@link java.io.OutputStream 抽象的输出目标} </li>
 * 		<li>{@link java.io.ByteArrayOutputStream 输出到内存缓冲区}</li>
 * 		<li>{@link java.io.FileOutputStream 输出到文件}</li>
 * 		<li>{@link java.io.PipedOutputStream 向管道输出字节} <p>
 * 		同 PipedInputStream 绑定于一个管道，在多线程中使用</li>
 * 		<li></li>
 * 		<li></li>
 * </ul>
 * 
 * 2，对数据源 OutputStream 装饰强化功能的字节流 
 * <ul>
 * 		<li>{@link java.io.FilterOutputStream 基础的装饰输出数据源}</li>
 * 		<li>{@link java.io.DataOutputStream 向目标写入基础类型数据}</li>
 * 		<li>{@link java.io.PrintStream 向目标格式化输出}</li>
 * 		<li>{@link java.io.BufferedOutputStream 使用缓冲区来缓冲对目标的输出}</li>
 * 		<li></li>
 * </ul>
 * 
 * <h3>适配器</h3>
 * <ul>
 * 		<li>{@link java.io.InputStreamReader 将 InputStream 转换成 Reader} <p>
 * 		通过 InputStreamReader 传入字符集参数获得流解码器 StreamDecoder </li>
 * 		<li>{@link java.io.OutputStreamWriter 将 OutputStream 转换成 Writer} <p>
 * 		通过 OutputStreamWriter 传入字符集参数获得流编码器 StreamEncoder </li>
 * </ul>
 * 
 * <h3>Reader</h3>
 * 1，表示从不同数据源产生指定字符集的输入字符流
 * <ul>
 * 		<li>{@link java.io.Reader 抽象的字符输入数据源}</li>
 * 		<li>{@link java.io.FileReader 文件相关的输入字符流}</li>
 * 		<li>{@link java.io.StringReader 将一个字符串作为字符数据源}</li>
 * 		<li>{@link java.io.CharArrayReader 通过字符缓冲区读取字符}</li>
 * 		<li>{@link java.io.PipedReader 从管道中读取字符} <p>
 * 		同 PipedWriter 绑定于一个管道，在多线程中使用</li>
 * </ul>
 * 
 * 2，对数据源 Reader 装饰强化功能的字符流 
 * <ul>
 * 		<li>{@link java.io.FilterReader 基础的装饰输入字符流}</li>
 * 		<li>{@link java.io.BufferedReader 使用缓冲区来缓存读取到的字符}</li>
 * 		<li>{@link java.io.LineNumberReader 跟踪字符流中的行号} <p>
 * 		LineNumberReader 继承于 BufferedReader</li>
 * 		<li>{@link java.io.PushbackReader 支持回退字符操作} <p>
 * 		unread(int) 回退读取的一个字符，该字符流内部的回退缓冲区是从右至左填充数据</li>
 * 		<li>{@link java.io.StreamTokenizer 标记字符流} <p>
 * 		根据 nextToken() 返回的参数去区分下一个标记的类型</li>
 * </ul>
 * 
 * 
 * <h3>Writer</h3>
 * 1，表示从不同数据源产生指定字符集的输出字符流
 * <ul>
 * 		<li>{@link java.io.Writer 抽象的字符输出目标}</li>
 * 		<li>{@link java.io.FileWriter 文件相关的输出字符流}</li>
 * 		<li>{@link java.io.StringWriter 字符流输出到一个 StringBuffer 对象}</li>
 * 		<li>{@link java.io.CharArrayWriter 向字符缓冲区写入字符}</li>
 * 		<li>{@link java.io.PipedWriter 向管道中写入字符} <p>
 * 		同 PipedReader 绑定于一个管道，在多线程中使用</li>
 * </ul>
 * 
 * 2，对数据源 Writer 装饰强化功能的字符流 
 * <ul>
 * 		<li>{@link java.io.FilterWriter 基础的字符流装饰类} <p>
 * 		IO 包内没有实现子类</li>
 * 		<li>{@link java.io.BufferedWriter 使用缓冲区来缓冲向目标的字符输出}</li>
 * 		<li>{@link java.io.PrintWriter 向目标格式化输出}</li>
 * 		<li></li>
 * </ul>
 * 
 * <h3>独立的类</h3>
 * {@link java.io.RandomAccessFile 支持读取和写入随机访问文件}
 */
package org.self.io.bio;
