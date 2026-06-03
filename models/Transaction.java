package models;


public class Transaction {
	private String id;
	private double amount;
	private String date;
	private String category;
	private String type; // INCOME OR EXPENSE
	
	
	public Transaction(String id, double amount, String date, String category, String type) {
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.category = category;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	
	public double getAmount() {
		return amount;
	}
	
	
	public String getDate() {
		return date;
	}
	
	
	public String getType() {
		return type;
	}
	
	
	@Override
	public String toString() {
		return id + " | " + type + " | " + amount + " | " + category + " | " + "date";
	}
	
}
	
