import org.springframework.beans.factory.annotation.Required;

public class Customer {
	private Person person;
	private int type;
	private String action;
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Person getPerson() {
		return person;
	}
	public String getPersonName() {
		return person.getName();
	}
	public int getPersonAge() {
		return person.getAge();
	}

	@Required
	public void setPerson(Person person) {
		this.person = person;
	}

}
