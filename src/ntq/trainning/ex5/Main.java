package ntq.trainning.ex5;


public class Main {

	public static void main(String[] args) {
		People p = new People();
		Address ar = new Address();
		ValueV v = new ValueV();
		p.setFirstName("Mai");
		p.setLastName("Vu");
		ar.setAddr("Phu Dien");
		ar.setCity("Ha Noi");
		v.setValueV("ABC");
		
		Dictionary<People, Address, ValueV> instancess = new Dictionary<People, Address, ValueV>();
		instancess.put(p, ar, v);
		
		ValueV vv = instancess.get(p, ar);
		System.out.println(vv.getValueV());
		System.out.println(instancess.containsKeys(p, ar));
		
	}

}
