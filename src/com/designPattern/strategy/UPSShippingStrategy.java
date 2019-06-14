package com.designPattern.strategy;

public class UPSShippingStrategy implements ShippingStrategy{

	@Override
	public double computeShippingCost() {
		return 3.0;
	}

}
