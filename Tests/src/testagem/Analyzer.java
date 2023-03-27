package testagem;

import java.util.ArrayList;

public class Analyzer<T> {
	private ArrayList<T> listA;
	private ArrayList<T> listB;
	private ArrayList<T> listC;
	private ArrayList<T> listD;
	
	public void analyze(ArrayList<T> firstList, ArrayList<T> secondList) {
		this.listA = firstList;
		this.listB = secondList;
		this.listC = new ArrayList<T>();
		this.listD = new ArrayList<T>();
		
		ArrayList<T> checkedElements = new ArrayList<T>();
		
		for(int i = 0; i < listB.size(); i++) {
			T currentElement = listB.get(i);
			
			if(!checkedElements.contains(currentElement)) {
				checkedElements.add(currentElement);
				if(this.listA.contains(currentElement)) {
					this.listC.add(currentElement);
				} else {
					this.listD.add(currentElement);
				}
			}
		}
	}
	
	public ArrayList<T> getListC() {
		return this.listC;
	}
	
	public ArrayList<T> getListD() {
		return this.listD;
	}
	
}
