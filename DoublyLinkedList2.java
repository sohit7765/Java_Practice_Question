
public class DoublyLinkedList2 {
class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
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
		n.prev=tail;
		tail=n;
	}
}
void deleteFromStart() {
	if(head==null) {
		System.out.println("LinkedList is Empty");
		return;
	}
	else if(head !=tail) {
		head=head.next;
		head.prev=null;
	}
	else {
		head=tail=null;
	}
}
void deleteFromEnd() {
	if(head==null) {
		System.out.println("LinkedList is Empty");
		return;
	}
	else if(head !=tail) {
		tail=tail.prev;
		tail.next=null;
	}
	else {
		head=tail=null;
	}
}
void deleteFromAnyPosition(int pos) {
	if(head==null) {
		System.out.println("LinkedList is Empty");
		return;
	}
	else if(head !=tail) {
		Node temp=head;
		Node ptr=temp.next;
		for(int i=1; i<pos-1; i++) {
			temp=ptr;
			ptr=ptr.next;
		}
		temp.next=ptr.next;
		ptr.next.prev=temp;
	}
	else {
		head=tail=null;
	}
}
void display() {
	Node temp=head;
	while(temp !=null) {
		System.out.print(temp.data+",");
		temp=temp.next;
	}
	System.out.println();
}
	public static void main(String[] args) {
		DoublyLinkedList2 d1=new DoublyLinkedList2();
		d1.addNode(10);
		d1.addNode(20);
		d1.addNode(30);
		d1.addNode(40);
		d1.addNode(50);
		d1.addNode(60);
		d1.addNode(70);
		d1.addNode(80);
		d1.display();
		System.out.println("After Deleting the First element from the Linked List");
		d1.deleteFromStart();
		d1.display();
		System.out.println("After deleting The last Element From the Linked List");
		d1.deleteFromEnd();
		d1.display();
		System.out.println("After Deleting the Element From Any Position in the Linked List ");
		d1.deleteFromAnyPosition(3);
		d1.display();
	}
}
