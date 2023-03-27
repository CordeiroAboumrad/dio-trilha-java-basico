package one.digitalinnovation;

public class BinaryTree<T extends Comparable<T>> {
	private BinaryTreeNode<T> treeRoot;
	
	public BinaryTree() {
		this.treeRoot = null;
	}
	
	public void insertTreeNode(T content) {
		BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(content);
		this.treeRoot = insert(this.treeRoot, newNode);
	}
	
	private BinaryTreeNode<T> insert(BinaryTreeNode<T> current, BinaryTreeNode<T> newNode) {
		if(current == null) {
			return newNode;
		} else if(newNode.getContent().compareTo(current.getContent()) < 0) {
			current.setLeftNode(insert(current.getLeftNode(), newNode));
		} else {
			current.setRightNode(insert(current.getRightNode(), newNode));
		}
		return current;
	}
	
	public void exhibitInOrder() {
		System.out.println("\nExibindo In Ordem:");
		exhibitInOrder(this.treeRoot);
	}
	
	private void exhibitInOrder(BinaryTreeNode<T> current) {
		if(current != null) {
			exhibitInOrder(current.getLeftNode());
			System.out.print(current.getContent() + ", ");
			exhibitInOrder(current.getRightNode());
		}
	}

	public void exhibitPostOrder() {
		System.out.println("\nExibindo Post Ordem:");
		exhibitPostOrder(this.treeRoot);
	}
	
	private void exhibitPostOrder(BinaryTreeNode<T> current) {
		if(current != null) {
			exhibitPostOrder(current.getLeftNode());
			exhibitPostOrder(current.getRightNode());
			System.out.print(current.getContent() + ", ");
		}
	}
	
	public void exhibitPreOrder() {
		System.out.println("\nExibindo Pre Ordem:");
		exhibitPreOrder(this.treeRoot);
	}
	
	private void exhibitPreOrder(BinaryTreeNode<T> current) {
		if(current != null) {
			System.out.print(current.getContent() + ", ");
			exhibitPreOrder(current.getLeftNode());
			exhibitPreOrder(current.getRightNode());
		}
	}
	
	public void removeTreeNode(T content) {
		try {
			BinaryTreeNode<T> current = this.treeRoot;
			BinaryTreeNode<T> parent = null;
			BinaryTreeNode<T> child = null;
			BinaryTreeNode<T> temporary = null;
			
			while(current != null && !current.getContent().equals(content)) {
				parent = current;
				if(content.compareTo(current.getContent()) < 0) {
					current = current.getLeftNode();
				} else {
					current = current.getRightNode();
				}
			}
			
			if(current == null) {
				System.out.println("Conteúdo não encontrado. Bloco try.");
			}
			
			if(parent == null) {
				if(current.getRightNode() == null) {
					this.treeRoot = current.getLeftNode();
				} else if(current.getLeftNode() == null) {
					this.treeRoot = current.getRightNode();
				} else {
					for(temporary = current, child = current.getLeftNode(); 
							child.getRightNode() != null; 
							temporary = child, child = child.getLeftNode()) {
						if(child != current.getLeftNode()) {
							temporary.setRightNode(child.getLeftNode());
							child.setLeftNode(this.treeRoot.getLeftNode());
						}
					}
					child.setRightNode(this.treeRoot.getRightNode());
					this.treeRoot = child;
				}
			} else if (current.getRightNode() == null) {
				if(parent.getLeftNode() == current) {
					parent.setLeftNode(current.getLeftNode());
				} else {
					parent.setRightNode(current.getLeftNode());
				}
			} else if (current.getLeftNode() == null) {
				if(parent.getLeftNode() == current) {
					parent.setLeftNode(current.getRightNode());
				} else {
					parent.setRightNode(current.getRightNode());
				}
			} else {
				for(temporary = current, child = current.getLeftNode(); 
						child.getRightNode() != null; 
						temporary = child, child = child.getRightNode()) {
					
					if(child != current.getLeftNode()) {
						temporary.setRightNode(child.getLeftNode());
						child.setLeftNode(current.getLeftNode());
					}
					child.setRightNode(current.getRightNode());
					if(parent.getLeftNode() == current) {
						parent.setLeftNode(child);
					} else {
						parent.setRightNode(child);
					}
				}
			}
			
		} catch(NullPointerException err) {
			System.out.println("Conteúdo não encontrado. Bloco catch.");
		}
	}
	
	
}
