package com.java8;

import java.util.ArrayList;
import java.util.List;

public class FilterTransaction {
	
	public List<Transaction> filterTransaction(List<Transaction> transactions, TransactionFilterPredicate p){
		List<Transaction> filteredTransaction = new ArrayList<>();
		transactions.forEach(t->{
			if(p.test(t))
				filteredTransaction.add(t);
		});
		return filteredTransaction;
		
	}

}
