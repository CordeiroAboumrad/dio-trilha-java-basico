package one.digitalinnovation;

public class LinkedList<T> {
	Node<T> refNode;

	public LinkedList() {
		this.refNode = null;
	}
	
	public boolean isEmpty() {
		return refNode == null ? true : false;
	}
	
	public int size() {
		int listSize = 0;
		Node<T> refAux = refNode;
		while(true) {
			if(refAux == null) {
				break;
			} else {
				listSize += 1;
				if(refAux.getRefNode() != null) {
					refAux = refAux.getRefNode();
				} else {
					break;
				}
			}
		}
		
		return listSize;
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<T>(content);
		if(this.isEmpty()) {
			refNode = newNode;
			return;
		}
		
		Node<T> auxNode = refNode;
		for(int i = 0; i < this.size() - 1; i++) {
			auxNode = auxNode.getRefNode();
		}
		auxNode.setRefNode(newNode);
	}
	
	public T get(int index) {
		return getNode(index).getDado();
	}
	
	private Node<T> getNode(int index){
		validateIndex(index);
		Node<T> auxNode = refNode;
		Node<T> returnNode = null;
		
		for(int i = 0; i <= index; i++) {
			returnNode = auxNode;
			auxNode = auxNode.getRefNode();
		}
		return returnNode;
	}
	
	public T remove(int index) {
		Node<T> pivotNode = this.getNode(index);
		if(index == 0) {
			this.refNode = pivotNode.getRefNode();
			return pivotNode.getDado();
		}
		Node<T> previousNode = getNode(index - 1);
		previousNode.setRefNode(pivotNode.getRefNode());
		return pivotNode.getDado();
	}
	
	private void validateIndex(int index) {
		int lastIndex = this.size() - 1;
		if(index >= this.size()) {
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta "
					+ "lista só vai até o índice " + lastIndex + ".");
		}
	}

	@Override
	public String toString() {
		String strReturn = "";
		Node<T> auxNode = refNode;
		
		for(int i = 0; i < this.size(); i++) {
			strReturn += "[Node{"
					+ "conteúdo = " + auxNode.getDado() + 
					"}] ---> ";
			auxNode = auxNode.getRefNode();
		}
		strReturn += "null";
		return strReturn;
	}
	
	
	
}
