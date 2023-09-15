public class SinglyLinkedList4 {
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
	void addNode(int data) {
		Node n=new Node(data);
		if(head==null) {
		head=n;
		tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	void deleteAtbeg() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else if(head !=tail) {
			head=head.next;
		}
		else {
			head=tail=null;
		}
	}
	void deleteAtend() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else if(head !=tail) {
			Node temp=head;
			Node ptr=temp.next;
			while(ptr.next !=null) {
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=null;
		}
		else {
			head=tail=null;
		}
	}
	void deleteAtmid(int pos) {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else if(head !=tail) {
			Node temp=head;
			Node ptr=temp.next;
			for(int i=0; i<pos-2; i++) {
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=ptr.next;
		}
		else {
			head=tail=null;
		}
	}
	void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
			while(current !=null) {
				System.out.print(current.data+",");
				current=current.next;
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		SinglyLinkedList4 s1=new SinglyLinkedList4();
		s1.addNode(10);
		s1.addNode(20);
		s1.addNode(30);
		s1.addNode(40);
		s1.addNode(50);
		s1.addNode(60);
		s1.addNode(70);
		s1.addNode(80);
		s1.display();
		System.out.println("After Delete Elements from begining");
		s1.deleteAtbeg();
		s1.display();
		System.out.println("After Delete Elements From end");
		s1.deleteAtend();
		s1.display();
		System.out.println("After Delete Elements from mid");
		s1.deleteAtmid(4);
		s1.display();

	}
}
 