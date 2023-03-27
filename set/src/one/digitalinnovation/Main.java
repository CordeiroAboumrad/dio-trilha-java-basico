package one.digitalinnovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Car> carHashSet = new HashSet<>();
		
		carHashSet.add(new Car("Ford"));
		carHashSet.add(new Car("Chevrolet"));
		carHashSet.add(new Car("Fiat"));
		carHashSet.add(new Car("Peugeot"));
		carHashSet.add(new Car("Zip"));
		carHashSet.add(new Car("Alfa Romemo"));
		
		System.out.println(carHashSet);
		
		Set<Car> carTreeSet = new TreeSet<>();
		
		carTreeSet.add(new Car("Ford"));
		carTreeSet.add(new Car("Chevrolet"));
		carTreeSet.add(new Car("Fiat"));
		carTreeSet.add(new Car("Peugeot"));
		carTreeSet.add(new Car("Zip"));
		carTreeSet.add(new Car("Alfa Romeo"));
		
		System.out.println(carTreeSet);
		
	}

}
