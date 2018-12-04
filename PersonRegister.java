import java.util.ArrayList;
public class PersonRegister {

	private ArrayList<Person> personer = new ArrayList<Person>();

	public ArrayList<Person> getPersoner() {
		return personer;
	}

	public void setPersoner(ArrayList<Person> personer) {
		this.personer = personer;
	}
	
	public void addPerson(Person p) {
		personer.add(p);
	}
	
	public Person findPerson(String pNbr) {
		for(Person p: personer){
			if(p.getpNbr().equals(pNbr)) return p;
			
	}
		
		return null;
	}
	
	public Person removePerson(String pNbr) {
		Person p = findPerson(pNbr);
		personer.remove(p);
		return p;
		
	}
	
}
