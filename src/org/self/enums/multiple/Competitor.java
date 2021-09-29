package org.self.enums.multiple;

/**
 * 剪刀，石头，布进行比较的接口
 * 
 * @author TungWang
 */
public interface Competitor<T extends Competitor<T>> {

	Outcome compete(T competitor);

}
