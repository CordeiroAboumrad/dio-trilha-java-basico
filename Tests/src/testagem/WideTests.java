package testagem;

public class WideTests {
	static class Factorial {
		static long getFactorial(int n) {
			long result = 1;
			if(n < 0) {
				for(int i = n; i <= -1; i++) {
					result *= i;
				}
			} else if(n == 0) {
				result = 1;
			} else {
				for(int i = n; i > 0; i--) {
					result *= i;
				}
			}
			return result;
		}
	}
	
	static class Node<T> {
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
	
	static class Queue<T> {
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
	
}
