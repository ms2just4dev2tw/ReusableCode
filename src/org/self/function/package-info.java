/**
 * <h2>函数接口</h2>
 * 为 lambda 表达式和方法引用提供目标类型
 * 
 * <h3>42: Lambda 优先于匿名类</h3>
 * 
 * <h3>43: 方法引用优先于 Lambda</h3>
 * 
 * <h3>44: 使用标准的函数接口</h3>
 * 
 * <h3>Function 接收参数的类型与返回结果的类型不一致</h3>
 * 
 * {@link java.util.function.Function 接收一个 T 类型参数并返回 R 类型结果} <p>
 * 
 * {@link java.util.function.IntToLongFunction 将 int 类型参数转换成 long 类型结果} <p>
 * {@link java.util.function.IntToDoubleFunction 将 int 类型参数转换成 Double 类型结果} <p>
 * {@link java.util.function.LongToIntFunction 将 long 类型参数转换成 int 类型结果} <p>
 * {@link java.util.function.LongToDoubleFunction 将 long 类型参数转换成 double 类型结果} <p>
 * {@link java.util.function.DoubleToIntFunction 将 double 类型参数转换成 int 类型结果} <p>
 * {@link java.util.function.DoubleToLongFunction 将 double 类型参数转换成 long 类型结果} <p>
 * 
 * {@link java.util.function.IntFunction 接收一个 int 类型参数并返回 R 类型结果} <p>
 * {@link java.util.function.LongFunction 接收一个 long 类型参数并返回 R 类型结果} <p>
 * {@link java.util.function.DoubleFunction 接收一个 double 类型参数并返回 R 类型结果} <p>
 * 
 * {@link java.util.function.ToIntFunction 接收一个 T 类型参数并返回 int 类型结果} <p>
 * {@link java.util.function.ToLongFunction 接收一个 T 类型参数并返回 long 类型结果} <p>
 * {@link java.util.function.ToDoubleFunction 接收一个 T 类型参数并返回 double 类型结果} <p>
 * 
 * {@link java.util.function.BiFunction 接收一个 T 类型参数和一个 U 类型参数并返回 R 类型结果} <p>
 * 
 * {@link java.util.function.ToIntBiFunction 接收一个 T 类型参数和一个 U 类型参数并返回 int 类型结果} <p>
 * {@link java.util.function.ToLongBiFunction 接收一个 T 类型参数和一个 U 类型参数并返回 long 类型结果} <p>
 * {@link java.util.function.ToDoubleBiFunction 接收一个 T 类型参数和一个 U 类型参数并返回 double 类型结果} <p>
 * 
 * <h3>Operator 接收参数与返回结果是同一类型</h3>
 * 
 * {@link java.util.function.UnaryOperator 接收一个 T 类型参数并返回 T 类型结果} <p>
 * 
 * {@link java.util.function.IntUnaryOperator 接收一个 int 类型参数并返回 int 类型结果} <p>
 * {@link java.util.function.LongUnaryOperator 接收一个 long 类型参数并返回 long 类型结果} <p>
 * {@link java.util.function.DoubleUnaryOperator 接收一个 double 类型参数并返回 double 类型结果} <p>
 * 
 * {@link java.util.function.BinaryOperator 接收两个 T 类型参数并返回 T 类型结果} <p>
 * 
 * {@link java.util.function.IntBinaryOperator 接收两个 int 类型参数并返回 int 类型结果} <p>
 * {@link java.util.function.LongBinaryOperator 接收两个 long 类型参数并返回 long 类型结果} <p>
 * {@link java.util.function.DoubleBinaryOperator 接收两个 double 类型参数并返回 double 类型结果} <p>
 * 
 * <h3>Predicate 接收参数并返回 boolean 类型的结果</h3>
 * 
 * {@link java.util.function.Predicate 接收一个 T 类型参数并返回 boolean 类型的结果} <p>
 * 
 * {@link java.util.function.IntPredicate 接收一个 int 类型参数并返回 boolean 类型的结果} <p>
 * {@link java.util.function.LongPredicate 接收一个 long 类型参数并返回 boolean 类型的结果} <p>
 * {@link java.util.function.DoublePredicate 接收一个 double 类型参数并返回 boolean 类型的结果} <p>
 * 
 * {@link java.util.function.BiPredicate 接收一个 T 类型参数和一个 U 类型参数并返回 boolean 类型结果} <p>
 * 
 * <h3>Supplier 没有参数但是返回一个结果</h3>
 * 
 * {@link java.util.function.Supplier 没有参数直接返回一个 T 类型结果} <p>
 * 
 * {@link java.util.function.IntSupplier 没有参数直接返回 int 类型结果} <p>
 * {@link java.util.function.LongSupplier 没有参数直接返回 long 类型结果} <p>
 * {@link java.util.function.DoubleSupplier 没有参数直接返回 double 类型结果} <p>
 * {@link java.util.function.BooleanSupplier 没有参数直接返回 boolean 类型结果} <p>
 * 
 * <h3>Consumer 接收参数但是不返回结果</h3>
 * 
 * {@link java.util.function.Consumer 接收一个 T 类型参数但不返回结果} <p>
 * 
 * {@link java.util.function.IntConsumer 接收一个 int 类型参数但不返回结果} <p>
 * {@link java.util.function.LongConsumer 接收一个 long 类型参数但不返回结果} <p>
 * {@link java.util.function.DoubleConsumer 接收一个 double 类型参数但不返回结果} <p>
 * 
 * {@link java.util.function.BiConsumer 接收一个 T 类型参数和一个 U 类型参数但不返回结果} <p>
 * 
 * {@link java.util.function.ObjIntConsumer 接收一个 T 类型参数和一个 int 类型参数但不返回结果} <p>
 * {@link java.util.function.ObjLongConsumer 接收一个 T 类型参数和一个 long 类型参数但不返回结果} <p>
 * {@link java.util.function.ObjDoubleConsumer 接收一个 T 类型参数和一个 double 类型参数但不返回结果} <p>
 * 
 */
package org.self.function;
