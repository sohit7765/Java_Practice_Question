
public class SinglyLinkedList1 {
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
	/*void insertAtBegin(int data) {
		Node n=new Node(data);
			if(head==null) {
				head=n;
				tail=n;
			}
			else {
				Node temp=head;
				head=n;
				n.next=temp;
			}
		}*/
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
		SinglyLinkedList1 s1=new SinglyLinkedList1();
		s1.addNode(10);
		s1.addNode(20);
		s1.addNode(30);
		s1.addNode(40);
		s1.addNode(50);
		//System.out.println("Before inserting the Element at the begining");
		System.out.println("Before inserting the Element at the End");
		s1.display();
		System.out.println("After inserting the Element at the End");
		//s1.insertAtBegin(100);
		s1.insertAtEnd(33);
		s1.display();
		
	}

}
