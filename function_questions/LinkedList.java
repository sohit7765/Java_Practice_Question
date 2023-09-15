package function_questions;

public class LinkedList {
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
	public void AddNode(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}
		else {
		n.next=head;
		head=n;
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty..");
		}
		else {
			while(current!=null) {
				System.out.print(current.data+" ");
				current =current.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.AddNode(23);
		l1.AddNode(32);
		l1.AddNode(54);
		l1.AddNode(65);
		l1.display();
	}

}
