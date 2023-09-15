
public class CircularLinkedList {
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
		}
		else {
			tail.next=n;
			tail=n;
			tail.next=head;
		}
	}
	void insertAtbeg(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		Node temp=head;
		head=n;
		n.next=temp;	
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
		do {
			System.out.print(current.data+",");
			current=current.next;
		}
		while(current !=head);
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		CircularLinkedList c1=new CircularLinkedList();
		c1.addNode(10);
		c1.addNode(20);
		c1.addNode(30);
		c1.addNode(40);
		c1.display();
		c1.insertAtbeg(100);
		c1.display();
	}

}
