/**
 * <h2>反射机制</h2>
 *  Reflection 允许以编程方式访问有关已加载类的字段，方法和构造函数的信息。
 *  <p>
 *  以及使用反射字段，方法和构造函数在封装和安全限制内对其底层对应项进行操作。
 *  
 *  <h3>反射对象</h3>
 *  {@link java.lang.reflect.AccessibleObject 是字段，方法，和构造器对象的基础类}
 *  <ul>
 *  	<li>{@link java.lang.reflect.Field 提供有关类或接口的单个字段的信息和动态访问}</li>
 *  	<li>{@link java.lang.reflect.Executable 共享功能方法和构造器的共享超类} <p>
 *  	<ul>
 *  		<li>{@link java.lang.reflect.Method 提供有关类或接口上的单个方法的信息和访问}</li>
 *  		<li>{@link java.lang.reflect.Constructor 提供有关类的单个构造函数的信息和访问权限}</li>
 *  	</ul></li>
 *  </ul>
 *  {@link java.lang.reflect.Parameter 有关方法参数的信息}
 *  
 *  <h3>代理相关</h3>
 *  {@link java.lang.reflect.InvocationHandler 代理实例的调用处理程序实现的接口}
 *  <p>
 *  {@link java.lang.reflect.Proxy 提供用于创建对象的静态方法}
 *  
 *  <h3>反射的其他辅助对象</h3>
 *  {@link java.lang.Class 提供用于加载动态类的静态方法}
 *  {@link java.lang.reflect.Modifier 提供静态方法和常量来解码类和成员访问修饰符}
 *  <p>
 *  {@link java.lang.reflect.ReflectPermission 指定反射的权限}
 *  <p>
 *  {@link java.lang.reflect.Array 提供动态创建和访问Java数组的静态方法}
 *  
 *  <h3>反射的使用场景</h3>
 *  此包中的类以及java.lang.Class适用于
 *  <ul>
 *  	<li>调试器</li>
 *  	<li>解释器</li>
 *  	<li>对象检查器</li>
 *  	<li>类浏览器等应用程序</li>
 *  	<li>需要访问目标对象的公共成员 (基于其运行时类) 的对象序列化</li>
 *  	<li>JavaBean等服务</li>
 *  </ul>
 */
package org.self.rtti.reflect;
