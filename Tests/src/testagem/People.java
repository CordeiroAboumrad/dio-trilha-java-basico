package testagem;
import java.util.HashMap;

public class People {
	private HashMap<String, String> people;
	
	public People() {
		people = new HashMap<String, String>();
		people.put("Marion","Engineer");
		people.put("James","Doctor");
		people.put("Frederick","Accountant");
		people.put("John","Lawyer");
	}
	
	public String getProfession(String name) {
		if(people.containsKey(name)) {
			
			String profession = people.get(name);
			return profession;
		} else {
			return "Not found.";
		}
	}
}
