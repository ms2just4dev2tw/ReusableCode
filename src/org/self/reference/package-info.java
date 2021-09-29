/**
 * <h2>引用对象类</h2>
 * 1，引用对象
 * <ul>
 * 		<li>{@link java.lang.ref.Reference 抽象引用基类} </li>
 * 		<li>{@link java.lang.ref.SoftReference 软引用} <p>
 * 		一个对象只有软引用，则垃圾回收器会在内存不足的时候才回收它</li>
 * 		<li>{@link java.lang.ref.WeakReference 弱引用} <p>
 * 		一个对象只有弱引用，则无论内存是否不足，垃圾回收器扫描到它的时候都会回收它</li>
 * 		<li>{@link java.lang.ref.PhantomReference 虚引用} <p>
 * 		一个对象只有虚引用，则生命周期等同于没有任何引用，垃圾回收器在任何时候都可能回收</li>
 * </ul>
 * 
 * 2，引用队列
 * <p>
 * {@link java.lang.ref.ReferenceQueue 垃圾回收器在检测到可达性更改后将引用对象附加到该引用队列}
 * <p>
 * 
 * 3，引用类的清理操作
 * <p>
 * {@link java.lang.ref.Cleaner 管理一组对象引用和相应的清理操作}
 */
package org.self.reference;
