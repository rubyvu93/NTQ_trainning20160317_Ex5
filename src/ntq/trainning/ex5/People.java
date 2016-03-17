package ntq.trainning.ex5;

public class People {
	private String firstName;
	private String lastName;

	public int hashCode() {
		return 31 * firstName.hashCode() + lastName.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof People)) return false;
		People p = (People) obj;
		return p.firstName.equals(firstName) && p.lastName.equals(lastName);
	}

	public People() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public People(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return "People [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
}
