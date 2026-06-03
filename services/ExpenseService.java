package services;


import models.Transaction;
import java.util.ArrayList;


public class ExpenseService {

	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	
	public void addTransaction(Transaction t) {
		transactions.add(t);
		System.out.println("Transaction added successfully!");
	}
	
	
	
	public void showTransactions() {
		if (transactions.isEmpty()) {
			System.out.println("No transactions found!");
			return;
		}
		
		for (Transaction t : transactions) {
			System.out.println(t);
		}
		
	}
	
	
	
	public double getBalance() {
	
		double balance = 0;
		
		for (Transaction t : transactions) {
			if (t.getType().equalsIgnoreCase("INCOME"))
				balance += t.getAmount();
			else 
				balance -= t.getAmount();
		}		
		
		return balance;
	}	
	
}
