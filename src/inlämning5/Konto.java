package inlämning5;

public class Konto {
	
	private String nbr;
	
	private double balance;
	
	public void setNbr(String newNbr) {
		
		nbr = newNbr;
		
	}
	 public String getNbr() {
		 
		 return nbr;
	 
	 }
	 
	 public void setBalance(double newBalance) {
		 
		  balance = newBalance;
		  
		 
	 }
	 
	 public double getBalance () {
		 
		 return balance;
		 
	 }
	 
	 public void credit(double amount) {
		 
		 balance += amount;
				 
	 }
	 
	 public void withdraw(double amount) {
		 
		 balance -= amount;
		 
	 }
	 
	

}
