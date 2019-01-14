
public class Test {
	
	public static void main(String[] args) { 
		
	 CreditCard creditCard1 = new CreditCard(123, "visa");
	 CreditCard creditCard2 = new CreditCard(234, "Master Card");
			 

	// Skapar två nya kunder
	Customer customer1 = new Customer ("111111-1111", "Anna Andersson");
	Customer customer2 = new Customer("222222-22222", "Beata Bengtsson");

	CustomerRegister customers = new CustomerRegister();

	creditCard1.setHolder(customer1); 
	creditCard2.setHolder(customer2);
	
	customer1.setCreditcard(creditCard1); 
	customer2.setCreditcard(creditCard2);
	
	customers.addCustomer(customer1); 
	customers.addCustomer(customer2);
	
	System.out.println(creditCard1.getHolder().getCName()); 
	System.out.println(customer2.getCreditcard().getCardNumber()); 
	Customer tmpC = customers.findCustomer("111111-1111");
	if (tmpC != null) {
		System.out.println("Hittade: " + tmpC.getCName()); 
		}
	customers.removeCustomer("111111-1111");
	Customer tmpCustomer = customers.findCustomer("111111-1111"); 
	if (tmpCustomer == null) {
	System.out.println("Fungerar!");
	
	}
	
}
	
}