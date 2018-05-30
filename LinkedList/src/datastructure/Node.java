package datastructure;


public class Node {
	private int key;
	private Node next;
	
	public Node(){
	}
	
	public Node(int key) {
		this.key = key;
		next = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [key= ").append(key).append( "]");
		return builder.toString();
	}
	
}
