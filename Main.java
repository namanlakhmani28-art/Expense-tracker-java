import models.Transaction;
import services.ExpenseService;

import java.util.Scanner;
import java.util.UUID;



public class Main {
	
	public static void main(String[] args) {
		
		
		ExpenseService service = new ExpenseService();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("\n========EXPENSE TRACKER======");
			System.out.println("1. Add Income");
			System.out.println("2. Add Expense");
			System.out.println("3. View Transactions");
			System.out.println("4. View Balance");
			System.out.println("5. Exit");
			
			System.out.println("Choose: ");
			
			int choice = sc.nextInt();
			
			
			
			switch(choice) {
				
				case 1: 
					System.out.println("Enter income amount:");
					double income = sc.nextDouble();
					
					
					service.addTransaction(new Transaction(UUID.randomUUID().toString(), income, "03-06-2026", "SALARY", "INCOME"));
					
					break;
				
				
				
				case 2: 
					System.out.println("Enter expense amount: ");
					double expense = sc.nextDouble();
					
					service.addTransaction(new Transaction(UUID.randomUUID().toString(), expense, "03-06-2026", "FOOD", "EXPENSE"));
					break;
					
					
				case 3: 
					service.showTransactions();
					break;
					
					
				case 4: 
					System.out.println("Current Balance: " + service.getBalance());
					break;
					
					
				case 5: 
					System.out.println("Exiting... ");
					return;
				
				
				default: 
					System.out.println("Invalid Choice");
					
					
			}
		}
		
		
		
	}
}
		
					
					
					
					
					
								
