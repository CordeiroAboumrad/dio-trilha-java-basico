package one.digitalinnovation.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj> {
	Integer myValue;
	
	public Obj(Integer myValue) {
		this.myValue = myValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(myValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Obj other = (Obj) obj;
		return Objects.equals(myValue, other.myValue);
	}

	@Override
	public int compareTo(Obj other) {
		int i = 0;
		
		if(this.myValue > other.myValue) {
			i = 1;
		} else if (this.myValue < other.myValue) {
			i = -1;
		}
		
		return i;
	}

	@Override
	public String toString() {
		return myValue.toString();
	}
	
	
	
}
