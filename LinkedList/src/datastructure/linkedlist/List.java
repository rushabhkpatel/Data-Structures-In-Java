
package datastructure.linkedlist;
import datastructure.Node;

public class List {
	static Node head = null;
	static int length = 0;
	
	
	
	public void add(int k, int pos) {
		length++;
		Node temp = new Node(k);
		// If list is empty add it in the beginning
		if(head == null) {
			head = temp;
		}else {
			if(pos == 0) {
				temp.setNext(head);
				head = temp;
			}else {
				int i = 0;
				Node cur = head;
				Node prev = null;
				while(i < pos && cur != null) {
					i++;
					prev = cur;
					cur = cur.getNext();
				}
				prev.setNext(temp);
				temp.setNext(cur);
			}
		}
	}
	
	//Four scenarios, if list is empty or the head is the Node to delete or Node to delete is some other Node  or 
	//Node to delete is not present in the list.
	public void delete(int k) {	
		if(head == null) {
			System.out.println("List is empty, nothing to delete.");
		}else if(head.getKey() == k) {
			head = head.getNext();
			length--;
		}else {
			Node cur = head.getNext();
			Node prev = head;
			while(cur.getKey() != k && cur.getNext() != null) {
				prev = cur;
				cur = cur.getNext();
			}
			//Two scenarios, either Node to delete is found or it's the end of the list.
			if(cur.getKey() == k) {
				prev.setNext(cur.getNext());
				length--;
			}else {
				System.out.printf("The Node with value %s was not present!\n",k);
			}
		}
	}

	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp);
			temp = temp.getNext();
		}
	}
}

