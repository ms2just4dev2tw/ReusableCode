/**
 * <h3>多路分发</h3>
 * 对于 Number 这种表示各种数字对象的超类，当两个超类对象进行运算时，我们该怎么交互
 * <p>
 * 一般来说，Java是支持单路分发的，也就是涉及到多个类型未知对象的操作时，Java只能绑定一个
 * <p>
 * <h3>要解决这个问题的办法就是多路分发</h3>
 * 如果需要处理两个不同的类型体系，就需要为每个类型体系提供一个方法调用，也就是
 * 通过一个方法调用决定一个未知类型。
 */
package org.self.enums.multiple;
