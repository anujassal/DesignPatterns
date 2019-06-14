package com.designPattern.services;

import com.designPattern.strategy.ShippingStrategy;

public class ShippingCostCalculatorService {
	
	private ShippingStrategy shippingMethod;
	
	public ShippingCostCalculatorService(ShippingStrategy shipMethod){
		this.shippingMethod = shipMethod;
	}
	
	public double calculateOrderShipping(){
		return this.shippingMethod.computeShippingCost();
	}

}
