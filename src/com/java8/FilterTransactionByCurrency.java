package com.java8;

public class FilterTransactionByCurrency implements TransactionFilterPredicate{

	@Override
	public boolean test(Transaction t) {
		return t.getCurrency().equals("USD");
	}

}
