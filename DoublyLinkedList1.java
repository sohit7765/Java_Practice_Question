
public class DoublyLinkedList1 {
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void addNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	void insertAtstart(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			n.next=head;
			head.prev=n;
			head=n;
		}
	}
	
	void insertAtend(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	void insertAtAnyposition(int data,int pos) {
		Node n=new Node(data);
		Node temp=head;
		Node ptr=temp.next;
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			for(int i=1; i<pos-1; i++) {
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=n;
			n.prev=temp;
			n.next=ptr;
			ptr.prev=n;
		}
	}
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		while(temp !=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoublyLinkedList1 d1=new DoublyLinkedList1();
		d1.addNode(10);
		d1.addNode(20);
		d1.addNode(30);
		d1.addNode(40);
		d1.addNode(50);
		d1.display();
		System.out.println("After Inserting The Element At First Position");
		d1.insertAtstart(100);
		d1.display();
		System.out.println("After Inserting The Elements At End Position");
		d1.insertAtend(200);
		d1.display();
		System.out.println("After Inserting The Elements At any Position");
		d1.insertAtAnyposition(500,4);
		d1.display();
	}
}
