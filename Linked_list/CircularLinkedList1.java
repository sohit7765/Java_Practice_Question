
public class CircularLinkedList1 {
	class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
	}
	Node head=null;
	Node tail=null;
	public void addNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
			n.next=head;
		}
		tail.next=n;
		tail=n;
		tail.next=head;
	}
	void insertAtbeg(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
			n.next=head;
		}
		Node temp=head;
		head=n;
		n.next=temp;
		tail.next=head;
	}
	void insertAtEnd(int data) {
		Node n=new Node(data);
			if(head==null) {
				head=n;
				tail=n;
				n.next=head;
			}
			else {
			tail.next=n;
			tail=n;
			tail.next=head;
		}
	}
	void insertAtAnypos(int data,int pos) {
		Node n=new Node(data);
		Node temp=head;
			if(head==null) {
				head=n;
				tail=n;
				n.next=head;
			}
			else {
				for(int i=0; i<pos-1; i++) {
					temp=temp.next;
				}
				n.next=temp.next;
				temp.next=n;
			}
	}
	void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
		do {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		while(temp !=head);
	}
		System.out.println();
	}
	public static void main(String[] args) {
		CircularLinkedList1 c1=new CircularLinkedList1();
		c1.addNode(10);
		c1.addNode(20);
		c1.addNode(30);
		c1.addNode(40);
		c1.addNode(50);
		c1.display();
		System.out.println("After Inserting The Element At Begining of The Linked List");
		c1.insertAtbeg(100);
		c1.display();
		System.out.println("After Inserting The Elements At end of The Linked list");
		c1.insertAtEnd(200);
		c1.display();
		System.out.println("After Inserting The Elements At Any Position ");
		c1.insertAtAnypos(300, 4);
		c1.display();
	}
}
