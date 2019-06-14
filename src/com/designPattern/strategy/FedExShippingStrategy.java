package com.designPattern.strategy;

public class FedExShippingStrategy implements ShippingStrategy{

	@Override
	public double computeShippingCost() {
		return 4.50;
	}

}
