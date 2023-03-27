package one.digitalinnovation;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Car> stackCar = new Stack<>();
		
		stackCar.push(new Car("Ford"));
		stackCar.push(new Car("Chevrolet"));
		stackCar.push(new Car("Fiat"));
		
		System.out.println(stackCar);
//		System.out.println(stackCar.pop());
		System.out.println(stackCar.peek());
		System.out.println(stackCar);
		
		System.out.println(stackCar.empty());
		System.out.println(stackCar);
	}

}
