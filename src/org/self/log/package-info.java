/**
 * <h2>日志</h2>
 * 
 * <h3>Logger</h3>
 * 应用程序进行 logging 调用的主要实体。Logger 对象用来记录特定系统或应用程序组件的日志消息
 * 
 * <h3>LogRecord</h3>
 * 用于在 logging 框架和单独的日志处理程序之间传递 logging 请求。
 * {@link java.util.logging.LogRecord }
 * 
 * <h3>Handler</h3>
 * 将 LogRecord 对象导出到各种目的地，包括内存、输出流、控制台、文件和套接字。
 * {@link java.util.logging.ConsoleHandler 此 Handler 向 System.err 发布日志记录}
 * {@link java.util.logging.FileHandler 简单的文件日志记录 Handler}
 * {@link java.util.logging.MemoryHandler Handler 在内存中的循环缓冲区中对请求进行缓冲处理}
 * {@link java.util.logging.SocketHandler 简单的网络日志 Handler}
 * {@link java.util.logging.StreamHandler 基于流的日志 Handler}
 * 
 * <h3>Level</h3>
 * 定义一组可以用来控制 logging 输出的标准 logging 级别。
 * {@link java.util.logging.Level Level 类定义了一组可用来控制日志输出的标准日志级别}
 * 
 * <h3>Filter</h3>
 * 为所记录的日志提供日志级别控制以外的细粒度控制。
 * {@link java.util.logging.Filter}
 * 
 * <h3>Formatter</h3>
 * 为格式化 LogRecord 对象提供支持。
 * {@link java.util.logging.SimpleFormatter 格式化纯文本}
 * {@link java.util.logging.XMLFormatter 格式化 XML 文本}
 * 
 */
package org.self.log;
