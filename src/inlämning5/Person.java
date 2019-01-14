package inlämning5;
import java.util.ArrayList;
public class Person {
	
	private String name;
	private String pNbr;
	private ArrayList<Account> konton = new ArrayList<Account>();
	
	public String getName() {
		return name;
		
		
		
	}
	
	public String getPNbr() {
		return pNbr;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setPnbr(String pNbr) {
		this.pNbr = pNbr;
		
	}
	
	
	
	public void addAccount(Account a) {
		konton.add(a);
	}

	public ArrayList<Account> getKonton() {
		return konton;
	}

	public void setKonton(ArrayList<Account> konton) {
		this.konton = konton;
	}
	
	
	
	
}
