package one.digitalinnovation;

import java.util.Arrays;

import one.digitalinnovation.model.Obj;

class Solution {
    public int findKthPositive(Integer[] arr, int k) {
        int counter = 0;
        int j = 0;
        for(int i = 1; i <= arr[arr.length - 1]; i++) {
            j = i;
            if(!Arrays.asList(arr).contains(i)) {
                counter += 1;
                System.out.println(Arrays.asList(arr).contains(i));
                System.out.println(i);
                if(counter == k) {
                    return i;
                }
            }
        }

        while(counter < k) {
            j++;
            counter++;
            if(counter == k) {
                return j;
            }
        }
        return j;
    }
}

public class Main {

	public static void main(String[] args) {
//		Pilha<Integer> minhaPilha = new Pilha<Integer>();
//		minhaPilha.push(2);
//		minhaPilha.push(4);
//		minhaPilha.push(7);
//		minhaPilha.push(10);
//		minhaPilha.push(12);
//		minhaPilha.push(16);
//		
//		System.out.println(minhaPilha);
//		
//		System.out.println(minhaPilha.pop());
//		
//		System.out.println(minhaPilha);
//		
//		System.out.println(minhaPilha.top());
//		
//		Queue<Integer> minhaFila = new Queue<Integer>();
//		minhaFila.enqueue(2);
//		minhaFila.enqueue(4);
//		minhaFila.enqueue(7);
//		minhaFila.enqueue(10);
//		minhaFila.enqueue(12);
//		minhaFila.enqueue(16);
//		
//		System.out.println(minhaFila);
//		minhaFila.dequeue();
//		System.out.println(minhaFila);
//		minhaFila.dequeue();
//		System.out.println(minhaFila);
//		
//		System.out.println(minhaFila.getFirst());
//		
//		
//		
//		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
//		myLinkedList.add(1);
//		myLinkedList.add(3);
//		myLinkedList.add(10);
//		myLinkedList.add(7);
//		
//		System.out.println(myLinkedList.get(0));
//		System.out.println(myLinkedList.get(1));
//		System.out.println(myLinkedList.get(2));
//		System.out.println(myLinkedList.get(3));
//		
//		System.out.println(myLinkedList.toString());
//		
//		myLinkedList.remove(1);
//		System.out.println(myLinkedList.toString());
		
//		DoubleLinkedList<Integer> myDoubleLinkedList = new DoubleLinkedList<Integer>();
//		myDoubleLinkedList.add(10);
//		myDoubleLinkedList.add(16);
//		myDoubleLinkedList.add(2);
//		myDoubleLinkedList.add(7);
//		myDoubleLinkedList.add(9);
//		myDoubleLinkedList.add(21);
//		myDoubleLinkedList.add(108);
//		
//		System.out.println(myDoubleLinkedList);
//		
//		myDoubleLinkedList.remove(3);
//		System.out.println(myDoubleLinkedList);
//
//		myDoubleLinkedList.add(99, 4);
//		System.out.println(myDoubleLinkedList);
		
//		CircularList<Integer> myCircularList = new CircularList<Integer>();
//		myCircularList.add(10);
//		System.out.println(myCircularList);
//		
//		myCircularList.remove(0);
//		System.out.println(myCircularList);
//		
//		myCircularList.add(26);
//		System.out.println(myCircularList);
//		
//		myCircularList.add(1);
//		System.out.println(myCircularList);
//		myCircularList.add(3);
//		System.out.println(myCircularList);
//		
//		System.out.println(myCircularList.get(0));
//		System.out.println(myCircularList.get(2));
//		System.out.println(myCircularList.get(3));
//		System.out.println(myCircularList.get(7));
//		System.out.println(myCircularList.get(8));
//		System.out.println(myCircularList.get(9));
		
//		Solution solution = new Solution();
//		Integer[] input = {2, 3, 4, 7, 11};
//		int result = solution.findKthPositive(input, 5);
//		System.out.println(result);
		
		BinaryTree<Obj> myTree = new BinaryTree<Obj>();
		
		myTree.insertTreeNode(new Obj(13));
		myTree.insertTreeNode(new Obj(10));
		myTree.insertTreeNode(new Obj(25));
		myTree.insertTreeNode(new Obj(2));
		myTree.insertTreeNode(new Obj(12));
		myTree.insertTreeNode(new Obj(20));
		myTree.insertTreeNode(new Obj(31));
		myTree.insertTreeNode(new Obj(29));
		
		myTree.exhibitInOrder();
		myTree.exhibitPreOrder();
		myTree.exhibitPostOrder();
		
		
		
	}	
	

}
