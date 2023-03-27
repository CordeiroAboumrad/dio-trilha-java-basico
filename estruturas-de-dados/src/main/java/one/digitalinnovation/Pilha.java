package one.digitalinnovation;

public class Pilha<T> {
	private Node<T> refNode;
	
	public Pilha() {
		this.refNode = null;
	}
	
	public boolean isEmpty() {
		return refNode == null ? true : false; 
	}
	
	public Node<T> top() {
		return refNode;
	}
	
	public void push(T insertNode) {
		Node<T> newNode = new Node<T>(insertNode);
		Node<T> refAux = refNode;
		refNode = newNode;
		newNode.setRefNode(refAux);
	}
	
	public Node<T> pop() {
		if(this.isEmpty()) {
			return null;
		}
		Node<T> popedNode = refNode;
		refNode = refNode.getRefNode();
		return popedNode;
	}
	
	@Override
	public String toString() {
		String returnString = "-----------------\n";
		returnString += "     Pilha\n";
		returnString += "-----------------\n";
		
		Node<T> auxiliaryNode = refNode;
		
		while(true) {
			if(auxiliaryNode == null) {
				break;
			} else {
				returnString += "Node{data = " + auxiliaryNode.getDado() + "}\n";
				auxiliaryNode = auxiliaryNode.getRefNode();
			}
		}
		returnString += "----------------------------------\n";
		return returnString;
	}
}
