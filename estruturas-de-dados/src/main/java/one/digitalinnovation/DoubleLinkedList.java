package one.digitalinnovation;

public class DoubleLinkedList<T> {
	Node<T> firstRefNode;
	Node<T> lastRefNode;
	
	private int listSize = 0;
		
	public DoubleLinkedList() {
		this.firstRefNode = null;
		this.lastRefNode = null;
		this.listSize = 0;
	}
	
	public int size() {
		return listSize;
	}
	
	private Node<T> getNode(int index){
		Node<T> auxNode = firstRefNode;
		for(int i = 0; (i < index) && (auxNode != null); i++) {
			auxNode = auxNode.getFollowingRefNode();
		}
		
		return auxNode;
	}
	
	public T get(int index) {
		return this.getNode(index).getDado();
	}
	
	public void add(T content) {
		Node<T> newNode = new Node<T>(content);
		newNode.setRefNode(this.lastRefNode);
		newNode.setFollowingRefNode(null);
		
		if(this.firstRefNode == null) {
			this.firstRefNode = newNode;
		}
		
		if(this.lastRefNode != null) {
			this.lastRefNode.setFollowingRefNode(newNode);
		}
		
		this.lastRefNode = newNode;
		this.listSize++;
	}
	
	public void add(T content, int index) {
		Node<T> auxNode = getNode(index);
		Node<T> newNode = new Node<T>(content);
		newNode.setFollowingRefNode(auxNode);
		
		if(newNode.getFollowingRefNode() != null) {
			newNode.setRefNode(auxNode.getRefNode());
			newNode.getFollowingRefNode().setRefNode(newNode);
		} else {
			newNode.setRefNode(this.lastRefNode);
			this.lastRefNode = newNode;
		}
		
		if(index == 0) {
			this.firstRefNode = newNode;
		} else {
			newNode.getRefNode().setFollowingRefNode(newNode);
		}
		
		listSize++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			this.firstRefNode = this.firstRefNode.getFollowingRefNode();
			
			if(this.firstRefNode != null) {
				this.firstRefNode.setRefNode(null);
			}
		} else {
			Node<T> auxNode = getNode(index);
			auxNode.getRefNode().setFollowingRefNode(auxNode.getFollowingRefNode());
			if(auxNode != this.lastRefNode) {
				auxNode.getFollowingRefNode().setRefNode(auxNode.getRefNode());
			} else {
				this.lastRefNode = auxNode;
			}
		}
		
		this.listSize--;
	}

	@Override
	public String toString() {
		String strReturn = "";
		
		Node<T> auxNode = this.firstRefNode;
		for(int i = 0; i < size(); i++){
			strReturn += "[Node{content = " + auxNode.getDado() + "}] <--> ";
			auxNode = auxNode.getFollowingRefNode();
		}
		strReturn += "null";
		
		return strReturn;
	}
	
}
