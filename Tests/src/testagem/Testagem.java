package testagem;
import java.util.Scanner;

import java.util.ArrayList;

public class Testagem {

	public static void main(String[] args) {
		long result = WideTests.Factorial.getFactorial(6);
		System.out.println(result);
		
		WideTests.Queue<String> minhaFila = new WideTests.Queue<String>();
		minhaFila.enqueue("Jean");
		minhaFila.enqueue("Lucia");
		minhaFila.enqueue("Joana");
		minhaFila.enqueue("Maria Amélia");
		minhaFila.enqueue("Dalton");
		minhaFila.enqueue("Eliane");
		System.out.println(minhaFila);
		
		
		People people = new People();
		try {			
			System.out.println(people.getProfession("Marion"));
			System.out.println(people.getProfession("Jean"));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid search.");
		}
		
		Analyzer<Integer> analyzer = new Analyzer<Integer>();
		
		String[] args1 = {};
		String[] args2 = {};
		
		try {
			Scanner scanner = new Scanner(System.in);
//			args1 = args[0].split(",");
//			args2 = args[1].split(",");
			System.out.println("Please input all the elements of list A, separated by comma:");
			args1 = scanner.nextLine().split(",");
			
			System.out.println("Please input all the elements of list B, separated by comma:");
			args2 = scanner.nextLine().split(",");
			
			scanner.close();
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No no no! Parameters were not valid!");
			System.exit(1);
		}
		
		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		
		for(String s: args1) {
			try {
				listA.add(Integer.parseInt(s.trim()));
			} catch(Exception e) {
				System.out.println(e);
				System.exit(1);
			}
		}
		
		for(String t : args2) {
			try {
				listB.add(Integer.parseInt(t.trim()));
			} catch(Exception e){
				System.out.println(e);
				System.exit(1);
			}
		}
		
		analyzer.analyze(listA, listB);
		
		System.out.println("List C:");
		System.out.println(analyzer.getListC());
		
		System.out.println("List D:");
		System.out.println(analyzer.getListD());
	}

}
