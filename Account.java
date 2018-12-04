
public class Account {

	private String nbr;
	private double balance;
	private Person p;
	
	public Person getP() {
		return p;
		
	}
	
	public void setP(Person p ) {
		this.p = p;
	}
	
	public String getNbr () {
		return nbr;
		
	}
	
	public double getBalance () {
		return balance;
		
	}
	
	public void setNbr(String nbr) {
		this.nbr = nbr;
	 
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
		
	public void credit(double amount) {
		balance = balance + amount;
		
	}
	
	public void withdraw(double amount) {
		
		if(balance >= amount) {
		balance = balance - amount;
		
		}
		
	}
	
}
