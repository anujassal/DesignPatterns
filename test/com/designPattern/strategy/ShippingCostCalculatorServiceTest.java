package com.designPattern.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.designPattern.services.ShippingCostCalculatorService;

public class ShippingCostCalculatorServiceTest {
	
	@Test
	public void testCalculateOrderShipping(){
		
		ShippingStrategy upsStrategy = new UPSShippingStrategy();
		ShippingCostCalculatorService shippingCostCalcservice = new ShippingCostCalculatorService(upsStrategy);
		assertEquals(shippingCostCalcservice.calculateOrderShipping(),3.0,0.0001);
		
		ShippingStrategy fedExstrategy = new FedExShippingStrategy();
		ShippingCostCalculatorService fedExShippingCostCalcservice = new ShippingCostCalculatorService(fedExstrategy);
		assertEquals(fedExShippingCostCalcservice.calculateOrderShipping(),4.5,0.0001);
	}

}
