package one.digitalinnovation;

public class Queue<T> {
	private Node<T> refNode;
	private Node<T> lastNode;

	public Queue() {
		this.refNode = null;
	}
	
	public boolean isEmpty() {
		return this.refNode == null ? true : false;
	}
	
	public void enqueue(T insertNode) {
		Node<T> newNode = new Node<T>(insertNode);
		if(this.refNode == null) {
			this.refNode = newNode;
		} else {
			this.lastNode.setRefNode(newNode);
		}
		this.lastNode = newNode;	
	}
	
	public Node<T> dequeue() {
		Node<T> auxiliaryNode = this.refNode;
		this.refNode = this.refNode.getRefNode();
		return auxiliaryNode;
	}
	
	public Node<T> getFirst() {
		return this.refNode;
	}

	@Override
	public String toString() {
		String returnString = "-----------------\n";
		returnString += "     Fila\n";
		returnString += "-----------------\n";
		
		Node<T> auxiliaryNode = this.refNode;
		while(true) {
			if(auxiliaryNode == null) {
				break;
			}
			returnString += "Node{data = " + auxiliaryNode.getDado() + "}\n";
			auxiliaryNode = auxiliaryNode.getRefNode();
		}
		returnString += "----------------------------------\n";
		return returnString;
	}
}
