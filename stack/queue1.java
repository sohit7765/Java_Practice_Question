package stack;

public class queue1 {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node front=null;
	Node rear=null;
	void addNode(int data) {
		Node n=new Node(data);
		if(front==null) {
			front=n;
			rear=n;
		}
		rear.next=n;
		rear=n;
	}
	void delete() {
		if(front==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
			front=front.next;
		}
	}
	void display() {
	Node temp=front;
	while(temp !=null) {
		System.out.print(temp.data+",");
		temp=temp.next;
	}
	System.out.println();
	}
	public static void main(String[] args) {
		queue1 q1=new queue1();
		q1.addNode(10);
		q1.addNode(20);
		q1.addNode(30);
		q1.addNode(40);
		q1.addNode(50);
		q1.delete();
		q1.delete();
		q1.addNode(60);
		q1.display();
	}
}
