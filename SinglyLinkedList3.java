public class SinglyLinkedList3 {
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
			tail.next=n;;
			tail=n;
		}
		size++;
	}
	public int size() {
		return size;
	}
	int linearSearch(int item) {
		Node temp=head;
		int pos=1;
		while(temp !=null) {
			if(temp.data==item) {
				return pos;
			}
			pos++;
			temp=temp.next;
		}
		return -1;
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
		SinglyLinkedList3 s1=new SinglyLinkedList3();
		s1.addNode(10);
		s1.addNode(20);
		s1.addNode(30);
		s1.addNode(40);
		s1.addNode(50);
		s1.addNode(60);
		s1.display();
		System.out.println("The Element is Present At "+s1.linearSearch(30)+" Position");
	}
}
