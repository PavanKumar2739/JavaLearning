package linkedList;

public class LL {
	private Node head;
	private Node tail;
	
	private int size;
	
	//initial size zero
	public LL() {
		this.size = 0;
		
	}
	
	//add beginning of the list
	//initializing the node
	public void addFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = node;
		}
		
		size += 1;
	}
	
	//add end of the list
	public void addLast(int val) {
		if(tail == null) {//Instantiating the node
			addFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size += 1;
	}
	
	//print the list
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("Done");
	}
	private class Node {
		private int value;
		private Node next;
		
		
		public Node(int value) {
			this.value = value;
		}


		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
		
		
		
	}

}
