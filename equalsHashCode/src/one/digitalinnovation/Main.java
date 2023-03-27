package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Car> carsList = new ArrayList<>();
		
		carsList.add(new Car("Volvo"));
		carsList.add(new Car("Ford"));
		carsList.add(new Car("Chevrolet"));
		
		System.out.println(carsList.contains(new Car("Ford")));
		System.out.println(new Car("Ford").hashCode());
		
		Car car1 = new Car("Ford");
		Car car2 = new Car("Chevrolet");
		
		System.out.println(car1.equals(car2));
		
	}

}
