package com.java8;

import java.math.BigDecimal;

public class Transaction {
	
	private int transactionId;
	private String currency;
	private BigDecimal notional;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getNotional() {
		return notional;
	}
	public void setNotional(BigDecimal notional) {
		this.notional = notional;
	}

}
