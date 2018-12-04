
public class Test {

	public static void main(String[] args) {
		
		PersonRegister reg = new PersonRegister();
		
		Person p1 = new Person();
		Person p2= new Person();
		
		p1.setName("Alicia");
		p1.setPnbr("950403");
		
		p2.setName("Johan");
		p2.setPnbr("940228");
		
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		
		a1.setNbr("1234");
		a1.setBalance(100);
		p1.addAccount(a1);
		a1.setP(p1);
		
		a2.setNbr("5678");
		a2.setBalance(150);
		p1.addAccount(a2);
		a2.setP(p1);
		
		
		a3.setNbr("91011");
		a3.setBalance(200);
		p2.addAccount(a3);
		a3.setP(p2);
		
		
		a4.setNbr("121314");
		a4.setBalance(250);
		p2.addAccount(a4);
		a4.setP(p2);
		
		reg.addPerson(p1);
		reg.addPerson(p2);
		
		for (Person f : reg.getPersoner()) {
			System.out.println(f.getPNbr());
		}
		
		for (Person p : reg.getPersoner()) {
			System.out.println(p.getName());
		}
		
	}

}
