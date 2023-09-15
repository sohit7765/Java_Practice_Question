
public class SinglyLinkedList2 {
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
		tail.next=n;
		tail=n;
	}
	public void max() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
			int max=head.data;
			while(current !=null) {
				if(max<current.data)
					max=current.data;
				current=current.next;
			}
			System.out.println("the maximum Element in the List is "+max);
		}
	}
	public void min() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		else {
			int min=head.data;
			while(current !=null) {
				if(min>current.data)
					min=current.data;
				current=current.next;
			}
			System.out.println("the minimum Element in the List is "+min);
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		while(current !=null) {
			System.out.print(current.data+",");
			current=current.next;
		}
		System.out.println();
		}

	public static void main(String[] args) {
		SinglyLinkedList2 s1=new SinglyLinkedList2();
		s1.addNode(54);
		s1.addNode(76);
		s1.addNode(33);
		s1.addNode(89);
		s1.addNode(55);
		s1.display();
		s1.max();
		s1.min();
	}

}
