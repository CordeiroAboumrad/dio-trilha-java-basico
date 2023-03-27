package one.digitalinnovation;

public class BinaryTreeNode<T extends Comparable<T>> {
	private T content;
	private BinaryTreeNode<T> leftNode;
	private BinaryTreeNode<T> rightNode;
	
	public BinaryTreeNode(T content) {
		this.content = content;
		this.leftNode = this.rightNode = null;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public BinaryTreeNode<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTreeNode<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
}
