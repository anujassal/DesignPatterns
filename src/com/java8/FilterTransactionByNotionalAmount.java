package com.java8;

import java.math.BigDecimal;

public class FilterTransactionByNotionalAmount implements TransactionFilterPredicate{

	@Override
	public boolean test(Transaction t) {
		return t.getNotional().compareTo(BigDecimal.valueOf(1200))>0;
	}

}
