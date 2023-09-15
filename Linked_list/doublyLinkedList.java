public class doublyLinkedList {
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.prev=null;
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
			n.prev=tail;
			tail=n;
		}
	}
	void insetAtbeg(int data) {
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
		doublyLinkedList d1=new doublyLinkedList();
		d1.addNode(11);
		d1.addNode(22);
		d1.addNode(33);
		d1.addNode(44);
		d1.display();
	}
}
