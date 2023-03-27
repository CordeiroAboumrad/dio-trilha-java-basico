package one.digitalinnovation;

import java.util.Objects;

public class Car implements Comparable<Car> {
	String marca;

	public Car(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + "]";
	}

//	@Override
//	public int compareTo(Car other) {
//		if(this.marca.length() < other.marca.length()) {
//			return -1;
//		} else if(this.marca.length() > other.marca.length()) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Car other) {
		return this.getMarca().compareTo(other.getMarca());
	}
}
