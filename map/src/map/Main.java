package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> student = new HashMap<>();
		student.put("Name", "João");
		student.put("Age", "17");
		student.put("Average Grade", "8.5");
		student.put("Class", "3A");
		
		System.out.println(student);
		
		System.out.println(student.keySet());
		
		System.out.println(student.values());
		
		Map<String, String> student2 = new HashMap<>();
		student2.put("Name", "Jean");
		student2.put("Age", "33");
		student2.put("Average Grade", "9.7");
		student2.put("Class", "1A");
		List<Map<String, String>> studentsList = new ArrayList<>();
		
		studentsList.add(student);
		studentsList.add(student2);
		
		System.out.println(studentsList);
		
	}

}
