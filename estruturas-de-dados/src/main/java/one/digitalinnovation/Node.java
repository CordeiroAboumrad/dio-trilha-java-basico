package one.digitalinnovation;

public class Node<T> {
	private T dado;
	private Node<T> refNode = null;
	private Node<T> followingRefNode = null;
	
	public Node() {
	}
	
	public Node(T dado) {
		this.dado = dado;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public Node<T> getRefNode() {
		return refNode;
	}

	public void setRefNode(Node<T> refNode) {
		this.refNode = refNode;
	}
	
	public Node<T> getFollowingRefNode() {
		return followingRefNode;
	}

	public void setFollowingRefNode(Node<T> followingRefNode) {
		this.followingRefNode = followingRefNode;
	}

	@Override
	public String toString() {
		return "Node [dado = " + dado + "]";
	}
}
