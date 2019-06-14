package com.designPattern.strategy;
/**
 * Strategy pattern is a behavioral design pattern that allows to select an algorithm/strategy at runtime.
 * 
 * @author anudeep
 *
 */
public interface ShippingStrategy {
	
	double computeShippingCost();

}
