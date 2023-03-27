package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Car> carQueue = new LinkedList<>();
		carQueue.add(new Car("Ford"));
		carQueue.add(new Car("Chevrolet"));
		carQueue.add(new Car("Fiat"));
		
		System.out.println(carQueue.add(new Car("Peugeot")));
		System.out.println(carQueue);
		
		System.out.println(carQueue.offer(new Car("Renault")));
		System.out.println(carQueue);
		
		System.out.println(carQueue.peek());
		System.out.println(carQueue);
		
		System.out.println(carQueue.poll());
		System.out.println(carQueue);
		
		System.out.println(carQueue.isEmpty());
		
		
		
	}

}
