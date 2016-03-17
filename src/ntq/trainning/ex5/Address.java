package ntq.trainning.ex5;

public class Address {
	private String addr;
	private String city;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String addr, String city) {
		super();
		this.addr = addr;
		this.city = city;
	}

	public Address() {
		super();
	}

	public int hashCode() {
		return 31 * addr.hashCode() + city.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Address)) return false;
		Address ar = (Address) obj;
		return ar.addr.equals(addr) && ar.city.equals(city);
	}
}
