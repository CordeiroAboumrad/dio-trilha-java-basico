package one.digitalinnovation;

public class CircularList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int listSize;
	
	public CircularList() {
		this.tail = null;
		this.head = null;
		this.listSize = 0;
	}
	
	public boolean isEmpty() {
		return this.listSize == 0 ? true : false;
	}
	
	public int size() {
		return this.listSize;
	}
	
	public T get (int index) {
		return this.getNode(index).getDado();
	}
	
	private Node<T> getNode(int index) {
		if(this.isEmpty()) 
			throw new IndexOutOfBoundsException("A lista está vazia!");
		
		if(index == 0) {
			return this.tail;
		}
		
		Node<T> auxNode = this.tail;
		for(int i = 0; (i < index) && (auxNode != null); i++) {
			auxNode = auxNode.getFollowingRefNode();
		}
		return auxNode;
	}
	
	public void remove(int index) {
		if(index >= this.listSize)
			throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
		
		Node<T> auxNode = this.tail;
		
		if(index == 0) {
			this.tail = this.tail.getFollowingRefNode();
			this.head.setFollowingRefNode(this.tail);
		} else if(index == 1) {
			this.tail.setFollowingRefNode(this.tail.getFollowingRefNode().getFollowingRefNode());
		} else {
			for(int i = 0; i < index - 1; i++) {
				auxNode = auxNode.getFollowingRefNode();
			}
			auxNode.setFollowingRefNode(auxNode.getFollowingRefNode().getFollowingRefNode());
		}
		
		this.listSize--;
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<T>(content);
		if(this.listSize == 0) {
			this.head = newNode;
			this.tail = this.head;
			this.head.setFollowingRefNode(this.tail);
		} else {
			newNode.setFollowingRefNode(this.tail);
			this.tail = newNode;
			this.head.setFollowingRefNode(this.tail);
		}
		this.listSize++;
	}

	@Override
	public String toString() {
		String strReturn = "";
		Node<T> auxNode = this.tail;
		
		for(int i = 0; i < this.listSize; i++) {
			strReturn += "[Node{content = " + auxNode.getDado() + "}] --> ";
			auxNode = auxNode.getFollowingRefNode();
		}
		
		strReturn += this.listSize >0 ? "(Return to beginning)" : "[]";
		
		return strReturn;
	}
	
}
