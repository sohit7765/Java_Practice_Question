
public class SinglyLinkedList {
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
	int size;
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
		size++;
	}
	public int size() {
		return size;
	}
	public int count() {
		int c=0;
		Node current=head;
		while(current!=null) {
			c++;
			current=current.next;
		}
		return c;
 	}
	void insertAtBegin(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			head=n;
			n.next=temp;
		}
	}
	void insertAtEnd(int data) {
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
	void insertAtPostion(int data,int idx) {
		Node n=new Node(data);
		Node temp=head;
		if(head==null) {
			head=n;
			tail=n;
		}
		for(int i=0; i<idx-1; i++) {
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}
	void insertAtmid(int data) {
		int count=size%2;
		Node n=new Node(data);
		Node temp=head;
		if(head==null) {
			head=n;
			tail=n;
		}
		for(int i=0; i<count-1; i++) {
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}
	void display() {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+",");
			cur=cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.addNode(10);
		s1.addNode(20);
		s1.addNode(30);
		s1.addNode(40);
		s1.display();
		System.out.println(s1.count());
		System.out.println(s1.size());
		System.out.println("After Inserting the Element At the Begining");
		s1.insertAtBegin(100);
		s1.display();
		System.out.println("After Inserting the Elements At the End");
		s1.insertAtEnd(200);
		s1.display();
		System.out.println("Insert at Any position");
		s1.insertAtPostion(500,3);
		s1.display();
		System.out.println("After Inserting the Elements At The Middle Of the List");
		s1.insertAtmid(1000);
		s1.display();
	}

}
