
public class CircularLinkedList2 {
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
		n.next=head;
	}
	tail.next=n;
	tail=n;
	tail.next=head;
}
void deleteAtbeg() {
	if(head==null) {
		System.out.println("List is Empty");
		return;
	}
	else if(head !=tail) {
		head=head.next;
		tail.next=head;
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
		while(ptr.next !=head) {
			temp=ptr;
			ptr=ptr.next;
		}
		temp.next=head;
		tail=temp;
	}
	else {
		head=tail=null;
	}
}
void deleteAtAnypos(int pos) {
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
		System.out.println();
	}
}
	public static void main(String[] args) {
		CircularLinkedList2 c1=new CircularLinkedList2();
		c1.addNode(10);
		c1.addNode(20);
		c1.addNode(30);
		c1.addNode(40);
		c1.addNode(50);
		c1.addNode(60);
		c1.addNode(70);
		c1.addNode(80);
		c1.display();
		System.out.println("After Deleting the First Element From the Linked List");
		c1.deleteAtbeg();
		c1.display();
		System.out.println("After Deleting the last Element From the Linked List");
		c1.deleteAtend();
		c1.display();
		System.out.println("After Deleting the Element AtAnypostion From the Linked List");
		c1.deleteAtAnypos(3);
		c1.display();
	}
}
