package datastructure;

public class LinkedList1 {
	Node head;
	private int size;
	
	LinkedList1(){
		this.size = 0;
		
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	//add-first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	//print
	public void printlist() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	public void reverse() {
		if(head == null || head.next == null) {
			return ;
		}
		
		
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next=prevNode;
			
			//update
			prevNode = currNode;
			currNode = nextNode; 
		}
		head.next = null;
		head = prevNode;
		
	}
	
	public int getsize() {
		return size;
	}
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.addFirst("a");
		list.addFirst("is");
		list.printlist();
		
		list.addLast("List");
		list.printlist();
		
		list.addFirst("This");
		list.printlist();
		
//		list.deleteFirst();
//		list.printlist();
//		
//		list.deleteLast();
//		list.printlist();
//		
//		System.out.println(list.getsize());	
//		list.addFirst("This");
//		
//		System.out.println(list.getsize());
		
		list.reverse();
		list.printlist();
		
		
		
	}

}
